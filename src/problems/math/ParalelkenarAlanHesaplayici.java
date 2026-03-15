package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class ParalelkenarAlanHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Taban uzunluğu: ");
        double taban = input.nextDouble();
        System.out.print("Yükseklik: ");
        double yukseklik = input.nextDouble();

        System.out.println("Paralelkenarın Alanı: " + (taban * yukseklik));
    }
}