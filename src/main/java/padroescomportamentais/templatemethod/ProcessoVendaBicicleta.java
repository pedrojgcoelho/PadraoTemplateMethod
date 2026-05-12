package padroescomportamentais.templatemethod;

public abstract class ProcessoVendaBicicleta {

    public final String processarPedido(String cliente, String modeloBicicleta) {
        StringBuilder resultado = new StringBuilder();

        resultado.append(receberPedido(cliente, modeloBicicleta));

        if (!verificarDisponibilidade(modeloBicicleta)) {
            resultado.append("\nVenda não realizada. Bicicleta indisponível: ").append(modeloBicicleta).append(".");
            return resultado.toString();
        }

        double valor = calcularValor(modeloBicicleta);

        resultado.append("\n").append(aprovarPagamento(cliente, valor));
        resultado.append("\n").append(prepararBicicleta(modeloBicicleta));

        if (deveAdicionarAcessorios()) {
            resultado.append("\n").append(adicionarAcessorios(modeloBicicleta));
        }

        resultado.append("\n").append(emitirDocumentoFiscal(cliente, modeloBicicleta, valor));
        resultado.append("\n").append(entregarBicicleta(cliente, modeloBicicleta));

        return resultado.toString();
    }

    protected String receberPedido(String cliente, String modeloBicicleta) {
        return "Pedido recebido de " + cliente + " para a bicicleta " + modeloBicicleta + ".";
    }

    protected String aprovarPagamento(String cliente, double valor) {
        return "Pagamento aprovado para " + cliente + " no valor de R$ " + valor + ".";
    }

    protected String emitirDocumentoFiscal(String cliente, String modeloBicicleta, double valor) {
        return "Nota fiscal emitida para " + cliente + " referente à bicicleta " + modeloBicicleta + " no valor de R$ " + valor + ".";
    }

    protected String entregarBicicleta(String cliente, String modeloBicicleta) {
        return "Bicicleta " + modeloBicicleta + " entregue ao cliente " + cliente + ".";
    }

    protected boolean deveAdicionarAcessorios() {
        return false;
    }

    protected String adicionarAcessorios(String modeloBicicleta) {
        return "Nenhum acessório adicional foi incluído.";
    }

    protected abstract boolean verificarDisponibilidade(String modeloBicicleta);

    protected abstract double calcularValor(String modeloBicicleta);

    protected abstract String prepararBicicleta(String modeloBicicleta);
}
