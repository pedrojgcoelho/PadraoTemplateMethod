package padroescomportamentais.templatemethod;

public class LojaBicicletasTemplateMethodDemo {

    public static void main(String[] args) {
        LojaBicicletas loja = new LojaBicicletas();

        ProcessoVendaBicicleta vendaMountainBike = new ProcessoVendaMountainBike();
        ProcessoVendaBicicleta vendaSpeedBike = new ProcessoVendaSpeedBike();
        ProcessoVendaBicicleta vendaUrbana = new ProcessoVendaBicicletaUrbana();

        System.out.println(loja.realizarVenda(vendaMountainBike, "João", "Mountain Bike Aro 29"));
        System.out.println();
        System.out.println(loja.realizarVenda(vendaSpeedBike, "Maria", "Speed Bike Carbon"));
        System.out.println();
        System.out.println(loja.realizarVenda(vendaUrbana, "Ana", "Bicicleta Urbana"));
    }
}
