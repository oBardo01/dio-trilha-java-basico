
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nSeja bem vindo, comece a criação de conta!");        

        System.out.println("Insira o número da conta (Formato: XXXX):");
        int numero = scanner.nextInt();

        System.out.println("Insira o número da agência (Formato: XXX-X):");
        String agencia = scanner.next();
        
        scanner.nextLine();

        System.out.println("Insira o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Insira o saldo:");
        Double saldo = scanner.nextDouble();

        System.out.println("\nCONTA CRIADA COM SUCESSO!\n--------------------\nCONTA:        " + numero + "\nAGÊNCIA:      " + agencia + "\nNOME CLIENTE: " + nomeCliente.toUpperCase() + "\nSALDO:        R$" + saldo);
    }
}
