package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class KelimeTekrarlayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Lütfen bir kelime giriniz :");
        String kelime = input.next();

        System.out.print("Kaç kere tekrarlansın? :");
        int tekrarSayisi = input.nextInt();

        for (int i = 0; i < tekrarSayisi; i++) {
            System.out.println(kelime);
        }
    }
}