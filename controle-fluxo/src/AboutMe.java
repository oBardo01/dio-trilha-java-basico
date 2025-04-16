
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu primeiro nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: (Ex: 1.75)");
            double altura = scanner.nextDouble();

            System.out.println("\nMe chamo " + nome + " " + sobrenome + "\nTenho " + idade + " anos\nTenho " + altura + "m de altura");
        } catch (InputMismatchException e) {
            System.err.println("Os inputs de idade e altura precisam ser numéricos.");
            
        }
    }
}
