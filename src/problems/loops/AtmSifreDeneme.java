package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class AtmSifreDeneme {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();

        int dogruSifre = 1234;
        int hak = 3;

        while (hak > 0) {
            System.out.print("Şifrenizi giriniz: ");
            int girilen = input.nextInt();

            if (girilen == dogruSifre) {
                System.out.println("Giriş başarılı! Hoş geldiniz.");
                break;
            } else {
                hak--;
                if (hak > 0) {
                    System.out.println("Yanlış şifre! Kalan hakkınız: " + hak);
                } else {
                    System.out.println("Kartınız bloke oldu! Şubeye gidiniz.");
                }
            }
        }
    }
}