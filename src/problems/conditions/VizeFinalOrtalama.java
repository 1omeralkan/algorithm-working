package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class VizeFinalOrtalama {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Vize notunuzu giriniz :");
        double vize = input.nextDouble();
        System.out.print("Final notunuzu giriniz :");
        double finalNotu = input.nextDouble();

        double ortalama = (vize * 0.4) + (finalNotu * 0.6);

        if (ortalama >= 50) {
            System.out.println("Tebrikler, geçtiniz! Ortalamanız: " + ortalama);
        } else {
            System.out.println("Kaldınız, seneye bekleriz. Ortalamanız: " + ortalama);
        }
    }
}