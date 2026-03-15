package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class OnSayiToplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            toplam += input.nextInt();
        }
        System.out.println("Girilen 10 sayının toplamı: " + toplam);
    }
}