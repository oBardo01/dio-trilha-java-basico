
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Lucas", "Ana", "Pedro", "Maria", "João" };

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("A média da turma é: %.1f\n", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scan) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Digite a nota do aluno %s: ", aluno);
            double nota = scan.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
