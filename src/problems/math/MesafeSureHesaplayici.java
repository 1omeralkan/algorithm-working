package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class MesafeSureHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Gidilecek mesafeyi (km) giriniz: ");
        double mesafe = input.nextDouble();
        int hiz = 60;

        double sure = mesafe / hiz;
        System.out.println("Araç " + mesafe + " km yolu " + sure + " saatte gider.");
    }
}