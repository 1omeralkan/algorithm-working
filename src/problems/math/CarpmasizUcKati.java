package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class CarpmasizUcKati {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int ucKati = sayi + sayi + sayi; // Amele usulü ama hayat kurtaran mantık :)
        System.out.println("Sayının 3 katı: " + ucKati);
    }
}