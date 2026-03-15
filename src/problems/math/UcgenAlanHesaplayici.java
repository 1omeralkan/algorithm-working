package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class UcgenAlanHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Taban uzunluğunu giriniz: ");
        double taban = input.nextDouble();
        System.out.print("Yüksekliği giriniz: ");
        double yukseklik = input.nextDouble();

        double alan = (taban * yukseklik) / 2;
        System.out.println("Üçgenin Alanı: " + alan);
    }
}