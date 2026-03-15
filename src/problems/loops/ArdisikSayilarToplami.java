package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class ArdisikSayilarToplami {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Bir tam sayı giriniz :");
        int sayi = input.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("1'den " + sayi + "'e kadar olan sayıların toplamı: " + toplam);
    }
}