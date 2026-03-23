package problems.arrays;

public class DiziOrtalamaHesaplayici {
    public static void solve() {
        double[] maaslar = {15000.5, 20000.0, 18500.0, 25000.0, 17000.0};
        double toplam = 0;

        for (int i = 0; i < maaslar.length; i++) {
            toplam += maaslar[i];
        }
        double ortalama = toplam / maaslar.length;
        System.out.println("Toplam Maaş : " + toplam + " | Ortalama: " + ortalama);
    }
}