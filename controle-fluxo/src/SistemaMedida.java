public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = args[0].toUpperCase();
        switch ( sigla ) {
            case "P" -> System.out.println("Pequeno");
            
            case "M" -> System.out.println("Médio");
            
            case "G" -> System.out.println("Grande");
            
            default -> System.out.println("Indefinido");
            
        }
    }
}
