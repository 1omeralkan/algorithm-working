package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class TekCiftKontrolu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girdiğiniz sayı çift.");
        } else {
            System.out.println("Girdiğiniz sayı tek.");
        }
    }
}