package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class PozitifNegatifSifirSayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int pozitifCount = 0, negatifCount = 0, sifirCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            if (sayi > 0) pozitifCount++;
            else if (sayi < 0) negatifCount++;
            else sifirCount++;
        }
        System.out.println("Pozitif: " + pozitifCount + " | Negatif: " + negatifCount + " | Sıfır: " + sifirCount);
    }
}