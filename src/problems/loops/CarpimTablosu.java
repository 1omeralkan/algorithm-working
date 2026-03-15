package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class CarpimTablosu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Çarpım tablosu için 1 ile 10 arası bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(sayi + " Sayısının Çarpım Tablosu:");
        for (int i = 1; i <= 10; i++) {
            int sonuc = sayi * i;
            System.out.println(sayi + " x " + i + " = " + sonuc);
        }
    }
}