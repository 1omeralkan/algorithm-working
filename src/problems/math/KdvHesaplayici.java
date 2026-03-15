package problems.math;

import utils.MathUtils;
import utils.ScannerUtil;
import java.util.Scanner;

public class KdvHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Fiyatı giriniz: ");
        double fiyat = input.nextDouble();

        double kdvliFiyat = MathUtils.addKDV(fiyat);
        System.out.println("KDV dahil fiyat: " + kdvliFiyat);
    }
}