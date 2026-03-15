package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class CiftSayiBulucu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Bir tam sayı giriniz :");
        int tamSayi = input.nextInt();

        for (int i = 1; i <= tamSayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}