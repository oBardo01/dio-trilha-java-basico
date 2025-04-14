public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }

    public void subirCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void descerCanal() {
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void ligar() {
        ligada = true;
        System.out.println("Peeunn");
    }

    public void desligar() {
        ligada = false;
        
        System.out.println("Vrmm");
    }

    public void aumentarVol() {
        volume++;
        uiVol();
    }

    public void diminuirVol() {
        volume--;
        uiVol();
    }

    public void uiVol() {
        System.out.print("VOLUME: " + this.volume + " [");
        for (int i = 0; i < this.volume; i++) {
            System.out.print("#");
        }
        
        for (int i = 0; i < (50 - this.volume); i++) {
            System.out.print("-");
        }
        System.out.print("]");
        System.out.println(" ");
    }
}
