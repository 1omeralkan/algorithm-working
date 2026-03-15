package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class GerilimHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.println("\n--- Gerilim (V = I * R) Hesaplama ---");
        System.out.print("Akım (I) değerini giriniz: ");
        double akim = input.nextDouble();
        System.out.print("Direnç (R) değerini giriniz: ");
        double direnc = input.nextDouble();

        double gerilim = akim * direnc;
        System.out.println("Kutuplar arası gerilim (V): " + gerilim);
    }
}