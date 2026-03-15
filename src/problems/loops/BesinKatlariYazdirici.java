package problems.loops;

public class BesinKatlariYazdirici {
    public static void solve() {
        for (int i = 1; i <= 40; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}