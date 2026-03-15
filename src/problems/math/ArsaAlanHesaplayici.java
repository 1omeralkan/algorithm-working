package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class ArsaAlanHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Kısa kenarı giriniz :");
        double kisaKenar = input.nextDouble();
        System.out.print("Uzun kenarı giriniz :");
        double uzunKenar = input.nextDouble();

        double alan = uzunKenar * kisaKenar;
        System.out.println("Alan : " + alan);
    }
}