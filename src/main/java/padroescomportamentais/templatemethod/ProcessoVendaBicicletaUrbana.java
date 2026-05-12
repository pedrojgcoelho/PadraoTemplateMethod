package padroescomportamentais.templatemethod;

public class ProcessoVendaBicicletaUrbana extends ProcessoVendaBicicleta {

    @Override
    protected boolean verificarDisponibilidade(String modeloBicicleta) {
        return !"Bicicleta Urbana Esgotada".equalsIgnoreCase(modeloBicicleta);
    }

    @Override
    protected double calcularValor(String modeloBicicleta) {
        return 1800.00;
    }

    @Override
    protected String prepararBicicleta(String modeloBicicleta) {
        return "Oficina instalou paralamas e regulou os freios da " + modeloBicicleta + ".";
    }

    @Override
    protected boolean deveAdicionarAcessorios() {
        return true;
    }

    @Override
    protected String adicionarAcessorios(String modeloBicicleta) {
        return "Acessórios adicionados à " + modeloBicicleta + ": campainha e cestinha.";
    }
}
