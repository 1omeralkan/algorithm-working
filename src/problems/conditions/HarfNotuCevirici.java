package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class HarfNotuCevirici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Öğrencinin notunu giriniz (0-100): ");
        int not = input.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Geçersiz Not! Lütfen 0 ile 100 arasında giriniz.");
        } else if (not >= 90) {
            System.out.println("Harf Notunuz: AA");
        } else if (not >= 80) {
            System.out.println("Harf Notunuz: BA");
        } else if (not >= 70) {
            System.out.println("Harf Notunuz: BB");
        } else if (not >= 60) {
            System.out.println("Harf Notunuz: CB");
        } else if (not >= 50) {
            System.out.println("Harf Notunuz: CC");
        } else {
            System.out.println("Harf Notunuz: FF (Kaldınız)");
        }
    }
}