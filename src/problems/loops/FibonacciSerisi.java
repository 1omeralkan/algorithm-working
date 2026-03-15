package problems.loops;

public class FibonacciSerisi {
    public static void solve() {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Serisi: " + a + " " + b);

        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}