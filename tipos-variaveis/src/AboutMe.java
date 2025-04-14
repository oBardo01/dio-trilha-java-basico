
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        // String nome = args[0];
        // int idade = Integer.parseInt(args[1]);
        // int altura = Integer.parseInt(args[2]);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Digite seu primeiro nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("\nMe chamo "+nome+"\nTenho "+idade+" anos\nTenho "+ altura+"m de altura");
    }
}
