public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 20.0;
        double valorSolicitado = 27.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        } 
        System.out.println(saldo);
    }
}
