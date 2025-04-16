public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "t".toUpperCase();

        switch (plano) {
            case "T":
                System.out.println("5Gb de Youtube");
            case "M":
                System.out.println("Whatsapp e Instagram Ilimitado");
            case "B":
                System.out.println("100 minutos de ligações");
        }
    }
}
