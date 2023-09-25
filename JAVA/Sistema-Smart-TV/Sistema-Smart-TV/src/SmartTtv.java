public class SmartTtv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // metodo aumentar e diminuir volume.
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }
    //final do metodo aumentar e diminuir volume

    //metodo ligar e desligar tv
    public void ligarTV() {
        ligada = true;
    }

    public void desligarTV() {
        ligada = false;
    }
    //final do metodo ligar e desligar tv

    //metodo mudar canal
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}