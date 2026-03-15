package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class OgrenciBasariDurumu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("1. Sınav Notu: ");
        double not1 = input.nextDouble();
        System.out.print("2. Sınav Notu: ");
        double not2 = input.nextDouble();
        System.out.print("Sözlü Notu: ");
        double sozlu = input.nextDouble();

        double ortalama = (not1 + not2 + sozlu) / 3;

        if (ortalama >= 50) {
            System.out.println("Ortalamanız " + ortalama + " -> GEÇTİ");
        } else {
            System.out.println("Ortalamanız " + ortalama + " -> KALDI");
        }
    }
}