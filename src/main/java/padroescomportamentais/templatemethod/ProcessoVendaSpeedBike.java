package padroescomportamentais.templatemethod;

public class ProcessoVendaSpeedBike extends ProcessoVendaBicicleta {

    @Override
    protected boolean verificarDisponibilidade(String modeloBicicleta) {
        return !"Speed Bike Esgotada".equalsIgnoreCase(modeloBicicleta);
    }

    @Override
    protected double calcularValor(String modeloBicicleta) {
        return 4200.00;
    }

    @Override
    protected String prepararBicicleta(String modeloBicicleta) {
        return "Oficina regulou câmbio de precisão e calibragem fina da " + modeloBicicleta + ".";
    }
}
