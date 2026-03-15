package problems.loops;

public class TekSayilarToplamiOrtalamasi {
    public static void solve() {
        int toplam = 0;
        int adet = 0;

        for (int i = 7; i <= 24; i++) {
            if (i % 2 != 0) {
                toplam += i;
                adet++;
            }
        }
        System.out.println("Tek Sayılar Toplamı: " + toplam + " | Ortalaması: " + ((double) toplam / adet));
    }
}