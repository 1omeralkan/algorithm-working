package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class KarmasikSayiIslemleri {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        int tekToplam = 0, ciftKareToplam = 0;
        long tekCarpim = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ciftKareToplam += (i * i);
            } else {
                tekToplam += i;
                tekCarpim *= i;
            }
        }
        System.out.println("Teklerin Toplamı: " + tekToplam);
        System.out.println("Teklerin Çarpımı: " + tekCarpim);
        System.out.println("Çiftlerin Kareleri Toplamı: " + ciftKareToplam);
    }
}