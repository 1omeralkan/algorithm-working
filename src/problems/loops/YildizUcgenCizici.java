package problems.loops;

public class YildizUcgenCizici {
    public static void solve() {
        System.out.println("Yıldız Üçgeni:");

        for (int satir = 1; satir <= 5; satir++) {

            for (int yildiz = 1; yildiz <= satir; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}