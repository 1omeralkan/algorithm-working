package problems.arrays;

import utils.ScannerUtil;
import java.util.Scanner;

public class ArrayReverseOrder {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int[] sayilar = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            sayilar[i] = input.nextInt();
        }

        System.out.println("Dizinin ters sırası:");
        for (int i = sayilar.length - 1; i >= 0; i--) {
            System.out.println(sayilar[i]);
        }
    }
}