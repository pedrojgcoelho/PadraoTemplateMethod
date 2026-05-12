package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaBicicletasTemplateMethodTest {

    @Test
    public void deveProcessarVendaMountainBike() {
        ProcessoVendaBicicleta processo = new ProcessoVendaMountainBike();

        assertEquals(
                "Pedido recebido de João para a bicicleta Mountain Bike Aro 29.\n" +
                        "Pagamento aprovado para João no valor de R$ 2500.0.\n" +
                        "Oficina ajustou suspensão e freios a disco da Mountain Bike Aro 29.\n" +
                        "Acessórios adicionados à Mountain Bike Aro 29: capacete e suporte para garrafa.\n" +
                        "Nota fiscal emitida para João referente à bicicleta Mountain Bike Aro 29 no valor de R$ 2500.0.\n" +
                        "Bicicleta Mountain Bike Aro 29 entregue ao cliente João.",
                processo.processarPedido("João", "Mountain Bike Aro 29")
        );
    }

    @Test
    public void deveProcessarVendaSpeedBike() {
        ProcessoVendaBicicleta processo = new ProcessoVendaSpeedBike();

        assertEquals(
                "Pedido recebido de Maria para a bicicleta Speed Bike Carbon.\n" +
                        "Pagamento aprovado para Maria no valor de R$ 4200.0.\n" +
                        "Oficina regulou câmbio de precisão e calibragem fina da Speed Bike Carbon.\n" +
                        "Nota fiscal emitida para Maria referente à bicicleta Speed Bike Carbon no valor de R$ 4200.0.\n" +
                        "Bicicleta Speed Bike Carbon entregue ao cliente Maria.",
                processo.processarPedido("Maria", "Speed Bike Carbon")
        );
    }

    @Test
    public void deveProcessarVendaBicicletaUrbana() {
        ProcessoVendaBicicleta processo = new ProcessoVendaBicicletaUrbana();

        assertEquals(
                "Pedido recebido de Ana para a bicicleta Bicicleta Urbana.\n" +
                        "Pagamento aprovado para Ana no valor de R$ 1800.0.\n" +
                        "Oficina instalou paralamas e regulou os freios da Bicicleta Urbana.\n" +
                        "Acessórios adicionados à Bicicleta Urbana: campainha e cestinha.\n" +
                        "Nota fiscal emitida para Ana referente à bicicleta Bicicleta Urbana no valor de R$ 1800.0.\n" +
                        "Bicicleta Bicicleta Urbana entregue ao cliente Ana.",
                processo.processarPedido("Ana", "Bicicleta Urbana")
        );
    }

    @Test
    public void deveInterromperVendaQuandoBicicletaEstiverIndisponivel() {
        ProcessoVendaBicicleta processo = new ProcessoVendaMountainBike();

        assertEquals(
                "Pedido recebido de Carlos para a bicicleta Mountain Bike Esgotada.\n" +
                        "Venda não realizada. Bicicleta indisponível: Mountain Bike Esgotada.",
                processo.processarPedido("Carlos", "Mountain Bike Esgotada")
        );
    }

    @Test
    public void deveUsarLojaParaRealizarVenda() {
        LojaBicicletas loja = new LojaBicicletas();
        ProcessoVendaBicicleta processo = new ProcessoVendaSpeedBike();

        assertEquals(
                "Pedido recebido de Fernanda para a bicicleta Speed Bike Carbon.\n" +
                        "Pagamento aprovado para Fernanda no valor de R$ 4200.0.\n" +
                        "Oficina regulou câmbio de precisão e calibragem fina da Speed Bike Carbon.\n" +
                        "Nota fiscal emitida para Fernanda referente à bicicleta Speed Bike Carbon no valor de R$ 4200.0.\n" +
                        "Bicicleta Speed Bike Carbon entregue ao cliente Fernanda.",
                loja.realizarVenda(processo, "Fernanda", "Speed Bike Carbon")
        );
    }
}
