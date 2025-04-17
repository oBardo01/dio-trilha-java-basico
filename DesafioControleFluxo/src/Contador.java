import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("CONTADOR");
        System.out.println("Digite o primeiro parâmetro: ");
        int paramUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int paramDois = terminal.nextInt();

        try {
            contar(paramUm, paramDois);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        } finally {
            terminal.close();
        }
    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
        if (paramDois > paramUm && paramUm > 0 && paramDois > 0) {

            System.out.println("Contador:");
            int limite = paramDois - paramUm;
            for (int i = 1; i <= limite; i++) {
                System.out.println(i);
            }
        } else {
            throw new ParametrosInvalidosException("Os parâmetros devem ser positivos e o segundo deve ser maior que o primeiro.");
        }
    }
}