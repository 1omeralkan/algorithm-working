package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class SifiraKadarTopla {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int genelToplam = 0;
        System.out.println("Sayıları girmeye başlayın (Çıkmak için 0 tuşlayın):");

        while (true) {
            System.out.print("Sayı: ");
            int eklenecekSayi = input.nextInt();

            if (eklenecekSayi == 0) {
                break;
            }
            genelToplam += eklenecekSayi;
        }

        System.out.println("Girilen sayıların genel toplamı: " + genelToplam);
    }
}