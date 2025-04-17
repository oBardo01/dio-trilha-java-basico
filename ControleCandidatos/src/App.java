import java.util.concurrent.ThreadLocalRandom;

public class App {

    public static void main(String[] args) throws Exception {
        String[] candidatos = {"FELIPE", "ANA", "JOÃO"};
        for ( String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static boolean atender() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            System.out.println("Tentativa " + tentativasRealizadas + " de contato com o candidato " + candidato);
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        } while ( continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Candidato " + candidato + " atendeu na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("Candidato " + candidato + " não atendeu após 3 tentativas.");
        }
    }

    static void candidatosSelecionado(String[] candidatosSelecionados) {
        for (String candidato : candidatosSelecionados) {
            System.out.println("Candidato: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "ANA", "JOÃO", "MARIA", "PAULO", "PEDRO", "LUCAS", "JULIA", "CARLA", "MARCOS"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + " - Salário Pretendido: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato Selecionado: " + candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        System.out.println("Total de candidatos selecionados: " + candidatosSelecionados);
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2500.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATO!");
        }
    }
}
