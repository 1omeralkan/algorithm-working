package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class SifreKontrolu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int dogruSifre = 1234;

        System.out.print("Lütfen şifrenizi giriniz :");
        int girilenSifre = input.nextInt();

        if (girilenSifre == dogruSifre) {
            System.out.println("Giriş Başarılı.");
        } else {
            System.out.println("Hatalı Şifre!");
        }
    }
}