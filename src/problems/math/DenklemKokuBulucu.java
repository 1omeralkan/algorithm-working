package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class DenklemKokuBulucu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("a değerini giriniz: ");
        double a = input.nextDouble();
        System.out.print("b değerini giriniz: ");
        double b = input.nextDouble();
        System.out.print("c değerini giriniz: ");
        double c = input.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double kok1 = (-b + Math.sqrt(delta)) / (2 * a);
            double kok2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("İki farklı kök var: X1=" + kok1 + ", X2=" + kok2);
        } else if (delta == 0) {
            double kok = -b / (2 * a);
            System.out.println("Çakışık tek kök var: X=" + kok);
        } else {
            System.out.println("Reel kök yoktur (Delta < 0).");
        }
    }
}