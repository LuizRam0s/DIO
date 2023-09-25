public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTtv novaTv = new SmartTtv();

        // Primeiros teste imprimindo na tela as configurações inicias
        System.out.println("O Canal atual da tv é: " + novaTv.canal);
        System.out.println("O volume atual da tv è: " + novaTv.volume);
        System.out.println("A tv esta ligada: " + novaTv.ligada);

        //Segundo teste aumento e diminuição de volume
        novaTv.aumentarVolume();
        System.out.println("\nO volume atual da tv è: " + novaTv.volume);
        novaTv.aumentarVolume();
        System.out.println("O volume atual da tv è: " + novaTv.volume);
        novaTv.aumentarVolume();
        System.out.println("O volume atual da tv è: " + novaTv.volume);
        novaTv.diminuirVolume();
        System.out.println("O volume atual da tv è: " + novaTv.volume);

        //Terceiro teste ligando e desligando a tv
        novaTv.ligarTV();
        System.out.println("\nA tv esta ligada: " + novaTv.ligada);
        novaTv.desligarTV();
        System.out.println("A tv esta ligada: " + novaTv.ligada);

        //Quarto teste mudando de canal

        novaTv.aumentarCanal();
        System.out.println("\nO Canal atual da tv é: " + novaTv.canal);
        novaTv.diminuirCanal();
        System.out.println("O Canal atual da tv é: " + novaTv.canal);
        novaTv.mudarCanal(15);
        System.out.println("O Canal atual da tv é: " + novaTv.canal);

    }
}
