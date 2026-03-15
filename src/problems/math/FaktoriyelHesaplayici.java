package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class FaktoriyelHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
        int faktoriyelSayi = input.nextInt();

        int carpim = 1;

        for (int i = 1; i <= faktoriyelSayi; i++) {
            carpim = carpim * i;
        }

        System.out.println(faktoriyelSayi + "! = " + carpim);
    }
}