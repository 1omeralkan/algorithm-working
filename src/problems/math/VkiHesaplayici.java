package problems.math;

import utils.MathUtils;
import utils.ScannerUtil;
import java.util.Scanner;

public class VkiHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Lütfen kilonuzu giriniz (kg) :");
        double kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz (m) :");
        double boy = input.nextDouble();

        double vki = MathUtils.calculateVKI(kilo, boy);
        System.out.println("Vücut kitle indeksiniz : " + vki);
    }
}