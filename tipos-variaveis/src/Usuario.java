public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTV = new SmartTv();

        // System.out.println("TV ligada ? " + smartTV.ligada);
        // System.out.println("Canal Atual: " + smartTV.canal);
        // System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();

        smartTV.subirCanal();
        smartTV.subirCanal();
        smartTV.subirCanal();
        smartTV.descerCanal();
        smartTV.mudarCanal(89);
        
        smartTV.aumentarVol();
        smartTV.diminuirVol();

        
    }
}