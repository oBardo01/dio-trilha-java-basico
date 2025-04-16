public class ExemploWhile {
    public static void main(String[] args) {
        int mesada = 50;

        while (mesada > 0) {
            int valorDoce = valorAleatorio();
            if(valorDoce > mesada) {
                System.out.println("Mesada insuficiente para comprar o doce: R$" + valorDoce);
                System.out.println("Valor restante: " + mesada);
                break;
            }

            System.out.println("Doce do valor: R$" + valorDoce + " Adiocionado ao carrinho.");
            mesada = mesada - valorDoce;
        }
    }

    public static int valorAleatorio() {
        return (int) (Math.random() * 10 + 10);
    }
}
