package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class NegatifSayiSayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int negatifAdet = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            if (input.nextInt() < 0) {
                negatifAdet++;
            }
        }
        System.out.println("Girilen sayılardan " + negatifAdet + " tanesi negatiftir.");
    }
}