package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class RakamlarToplami {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Bir sayı giriniz (Örn: 456): ");
        int girilenSayi = input.nextInt();
        int geciciSayi = girilenSayi;
        int rakamToplami = 0;

        while (geciciSayi > 0) {
            int sonRakam = geciciSayi % 10;
            rakamToplami = rakamToplami + sonRakam;
            geciciSayi = geciciSayi / 10;
        }

        System.out.println(girilenSayi + " sayısının rakamları toplamı: " + rakamToplami);
    }
}