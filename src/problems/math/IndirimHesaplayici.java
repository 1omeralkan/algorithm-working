package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class IndirimHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Lütfen ürün fiyatını giriniz :");
        double fiyat = input.nextDouble();

        double netFiyat = fiyat - (fiyat * 0.2);
        System.out.println("İndirimli fiyat : " + netFiyat);
    }
}