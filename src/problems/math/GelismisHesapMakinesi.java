package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.print("İşlem türünü giriniz (+, -, *, /): ");
        String islem = input.next();

        if (islem.equals("+")) {
            System.out.println("Sonuç: " + (sayi1 + sayi2));
        } else if (islem.equals("-")) {
            System.out.println("Sonuç: " + (sayi1 - sayi2));
        } else if (islem.equals("*")) {
            System.out.println("Sonuç: " + (sayi1 * sayi2));
        } else if (islem.equals("/")) {
            if (sayi2 == 0) {
                System.out.println("Hata: Bir sayı sıfıra bölünemez!");
            } else {
                System.out.println("Sonuç: " + (sayi1 / sayi2));
            }
        } else {
            System.out.println("Geçersiz işlem girdiniz!");
        }
    }
}