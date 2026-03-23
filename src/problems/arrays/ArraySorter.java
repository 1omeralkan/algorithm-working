package problems.arrays;

import utils.ScannerUtil;
import java.util.Scanner;

public class ArraySorter {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();

        System.out.print("Kaç sayı gireceksiniz? ");
        int n = input.nextInt();
        int[] sayilar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            sayilar[i] = input.nextInt();
        }

        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int j = 0; j < sayilar.length - i - 1; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    // swap işlemi
                    int temp = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = temp;
                }
            }
        }

        System.out.println("Sıralanmış dizi:");
        for (int eleman : sayilar) {
            System.out.println(eleman);
        }
    }
}