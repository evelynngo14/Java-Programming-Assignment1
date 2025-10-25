package cis3270.assignment1.chapter5;

public class Q18 {
    public static void main(String[] args) {
        patternA();
        patternB();
        patternC();
        patternD();
    }
    public static void patternA() {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }
    public static void patternB() {
        System.out.println("Pattern B");
        for (int i = 6; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }
    public static void patternC() {
        System.out.println("Pattern C");
        int space = 4;
        for (int i = 1; i <= 6; i++) {
            for (int k = 6; k >= i; k-- ) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf(" "+j);
            }
            System.out.println();
        }
    }
    public static void patternD() {
        System.out.println("Pattern D");
        int space = 4;
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= i; k++ ) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 6-i+1; j++) {
                System.out.printf(" "+j);
            }
            System.out.println();
        }
    }

}
