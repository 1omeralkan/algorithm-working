package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class SilindirAlanHacimHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Silindirin yarıçapını (r) giriniz: ");
        double rSil = input.nextDouble();
        System.out.print("Silindirin yüksekliğini (h) giriniz: ");
        double hSil = input.nextDouble();
        double piSil = Math.PI;

        double alanSil = 2 * piSil * rSil * (rSil + hSil);
        double hacimSil = piSil * Math.pow(rSil, 2) * hSil;
        System.out.println("Silindirin Alanı: " + alanSil + " | Hacmi: " + hacimSil);
    }
}