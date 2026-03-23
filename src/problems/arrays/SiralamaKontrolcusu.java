package problems.arrays;

public class SiralamaKontrolcusu {
    public static void solve() {
        int[] dizi = {2, 5, 8, 12, 20, 25}; // Sıralı bir örnek

        boolean siraliMi = true;

        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] > dizi[i + 1]) {
                siraliMi = false;
                break;
            }
        }

        if (siraliMi) {
            System.out.println("Sistem Raporu: Bu dizi küçükten büyüğe SIRALIDIR.");
        } else {
            System.out.println("Sistem Raporu: Bu dizi SIRALI DEĞİLDİR.");
        }
    }
}