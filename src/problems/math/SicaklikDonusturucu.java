package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class SicaklikDonusturucu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.println("\n--- Fahrenheit - Santigrat Çevirici ---");
        System.out.print("Fahrenheit değerini giriniz: ");
        double fahrenheit = input.nextDouble();
        double derece = (fahrenheit - 32) / 1.8;
        System.out.println("Santigrat karşılığı: " + derece);
    }
}