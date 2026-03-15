package problems.loops;

public class KarelerToplami {
    public static void solve() {
        long kareToplam = 0;
        for (int i = 1; i <= 25; i++) {
            kareToplam += (i * i);
        }
        System.out.println("1-25 arası sayıların kareleri toplamı: " + kareToplam);
    }
}