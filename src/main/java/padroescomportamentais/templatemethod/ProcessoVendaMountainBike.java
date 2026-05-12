package padroescomportamentais.templatemethod;

public class ProcessoVendaMountainBike extends ProcessoVendaBicicleta {

    @Override
    protected boolean verificarDisponibilidade(String modeloBicicleta) {
        return !"Mountain Bike Esgotada".equalsIgnoreCase(modeloBicicleta);
    }

    @Override
    protected double calcularValor(String modeloBicicleta) {
        return 2500.00;
    }

    @Override
    protected String prepararBicicleta(String modeloBicicleta) {
        return "Oficina ajustou suspensão e freios a disco da " + modeloBicicleta + ".";
    }

    @Override
    protected boolean deveAdicionarAcessorios() {
        return true;
    }

    @Override
    protected String adicionarAcessorios(String modeloBicicleta) {
        return "Acessórios adicionados à " + modeloBicicleta + ": capacete e suporte para garrafa.";
    }
}
