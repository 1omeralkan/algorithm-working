package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class VizeFinalGecmeDurumu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Vize notunuz: ");
        double vize = input.nextDouble();
        System.out.print("Final notunuz: ");
        double finalNotu = input.nextDouble();

        double ortalama = (vize * 0.30) + (finalNotu * 0.70);

        if (ortalama >= 50 && finalNotu >= 50) {
            System.out.println("Ortalama: " + ortalama + " - Geçtiniz.");
        } else {
            System.out.println("Ortalama: " + ortalama + " - Kaldınız. (Final min 50 ve Ort min 50 olmalı)");
        }
    }
}