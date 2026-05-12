package padroescomportamentais.templatemethod;

public class LojaBicicletas {

    public String realizarVenda(ProcessoVendaBicicleta processoVenda, String cliente, String modeloBicicleta) {
        return processoVenda.processarPedido(cliente, modeloBicicleta);
    }
}
