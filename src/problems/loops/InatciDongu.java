package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class InatciDongu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int sayi = 0;

        do {
            System.out.print("Lütfen 10 ile 15 arasında bir sayı giriniz: ");
            sayi = input.nextInt();
        } while (sayi < 10 || sayi > 15);

        System.out.println("Tebrikler, aralıkta bir sayı girdiniz!");
    }
}