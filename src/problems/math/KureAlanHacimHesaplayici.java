package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class KureAlanHacimHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Kürenin yarıçapını (r) giriniz: ");
        double r = input.nextDouble();
        double pi = Math.PI;

        double alan = 4 * pi * Math.pow(r, 2);
        double hacim = (4.0 / 3.0) * pi * Math.pow(r, 3);
        System.out.println("Kürenin Alanı: " + alan + " | Hacmi: " + hacim);
    }
}