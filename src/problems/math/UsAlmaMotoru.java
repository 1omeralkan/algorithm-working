package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class UsAlmaMotoru {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Taban sayısını giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int us = input.nextInt();

        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc = sonuc * taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }
}