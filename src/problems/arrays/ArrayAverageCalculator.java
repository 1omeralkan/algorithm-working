package problems.arrays;

public class ArrayAverageCalculator {
    public static void solve() {
        int[] sayilar = {10, 20, 30, 40, 50};

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }

        double ortalama = (double) toplam / sayilar.length;

        System.out.println("Ortalama: " + ortalama);
    }
}