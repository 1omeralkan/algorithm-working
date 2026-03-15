package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class MukemmelSayiDedektoru {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Kontrol edilecek sayıyı giriniz: ");
        int mukemmelSayi = input.nextInt();
        int bolenlerinToplami = 0;

        for (int i = 1; i < mukemmelSayi; i++) {
            if (mukemmelSayi % i == 0) {
                bolenlerinToplami = bolenlerinToplami + i;
            }
        }

        if (bolenlerinToplami == mukemmelSayi) {
            System.out.println(mukemmelSayi + " bir Mükemmel Sayıdır!");
        } else {
            System.out.println(mukemmelSayi + " Mükemmel Sayı değildir.");
        }
    }
}