public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou o programa no método Main.");
        a();
        System.out.println("Finalizou o programa no método Main.");
    }

    static void a() {
        System.out.println("entrou no método a()");
        b();
        System.out.println("finalizou oo método a()");
    }

    static void b() {
        System.out.println("entrou no método b()");
        for(int i = 0; i <= 5; i++) System.out.println(i);
        c();
        System.out.println("finalizou o método b()");
    }

    static void c() {
        System.out.println("entrou no método c()");
        Thread.dumpStack();
        System.out.println("finalizou o método c()");
    }
}
