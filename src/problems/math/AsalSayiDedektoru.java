package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class AsalSayiDedektoru {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        boolean asalMi = true;

        if (sayi < 2) {
            asalMi = false;
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        }

        if (asalMi) {
            System.out.println(sayi + " Asal bir sayıdır.");
        } else {
            System.out.println(sayi + " Asal sayı değildir.");
        }
    }
}