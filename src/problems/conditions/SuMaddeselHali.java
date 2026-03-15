package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class SuMaddeselHali {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Suyun sıcaklığını giriniz: ");
        double sicaklik = input.nextDouble();

        if (sicaklik <= 0) {
            System.out.println("Madde KATI haldedir.");
        } else if (sicaklik >= 100) {
            System.out.println("Madde GAZ haldedir.");
        } else {
            System.out.println("Madde SIVI haldedir.");
        }
    }
}