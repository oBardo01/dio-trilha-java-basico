public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("Continue Statement");
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Number: " + i);
        }
        
        System.out.println("Break Statement");
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Number: " + i);
        }
    }
}