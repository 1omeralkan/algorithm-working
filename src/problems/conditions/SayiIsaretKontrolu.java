package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class SayiIsaretKontrolu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi > 0) {
            System.out.println("Sayı Pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Sayı Negatiftir.");
        } else {
            System.out.println("Sayı Sıfırdır.");
        }
    }
}