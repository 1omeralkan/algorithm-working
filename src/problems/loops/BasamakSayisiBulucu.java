package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class BasamakSayisiBulucu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("0 ile 99.999 arası bir sayı giriniz: ");
        int sayi = input.nextInt();
        int basamakSayisi = 0;

        if (sayi == 0) {
            basamakSayisi = 1;
        } else {
            while (sayi > 0) {
                sayi = sayi / 10;
                basamakSayisi++;
            }
        }
        System.out.println("Girdiğiniz sayı " + basamakSayisi + " basamaklıdır.");
    }
}