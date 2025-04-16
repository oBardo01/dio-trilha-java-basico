public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 0;

        // if (nota >= 7) {
        //     System.out.println("Aprovado");
        // } else if (nota >= 5 && nota < 7) {
        //     System.out.println("Recuperação");
        // } else {
        //     System.out.println("Reprovado");
        // }

        // OU 

        // variavelComResultado = condição ? true : false
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        
        // variavelComResultado = condição ? true : condição ? true : false ;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
