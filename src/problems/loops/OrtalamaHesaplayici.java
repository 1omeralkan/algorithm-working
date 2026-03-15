package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class OrtalamaHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        double toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            toplam += input.nextDouble();
        }
        double ortalama = toplam / 5;
        System.out.println("Toplam: " + toplam + " | Ortalama: " + ortalama);
    }
}