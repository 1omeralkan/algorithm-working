package problems.arrays;

public class TekCiftAyiklayici {
    public static void solve() {
        int[] sayilar = {12, 5, 8, 13, 21, 24, 9};

        System.out.print("Çift Sayılar: ");
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                System.out.print(sayilar[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Tek Sayılar: ");
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 != 0) {
                System.out.print(sayilar[i] + " ");
            }
        }
        System.out.println();
    }
}