package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class UcDegerOrtalamaFarki {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        double toplam = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            double girilen = input.nextDouble();
            toplam += girilen;
            if (girilen < min) min = girilen;
            if (girilen > max) max = girilen;
        }

        double genelOrtalama = toplam / 10;
        double ucDegerOrtalamasi = (min + max) / 2;
        double fark = Math.abs(genelOrtalama - ucDegerOrtalamasi);

        System.out.println("Genel Ortalama: " + genelOrtalama + " | Uç Ortalama: " + ucDegerOrtalamasi);
        System.out.println("Aradaki Fark: " + fark);
    }
}