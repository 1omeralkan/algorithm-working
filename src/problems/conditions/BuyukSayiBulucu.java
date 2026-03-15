package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class BuyukSayiBulucu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("Büyük olan sayı: " + sayi1);
        } else if (sayi2 > sayi1) {
            System.out.println("Büyük olan sayı: " + sayi2);
        } else {
            System.out.println("Sayılar birbirine eşittir.");
        }
    }
}