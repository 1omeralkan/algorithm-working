package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class AradakiSayilariListele {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("A sayısını giriniz: ");
        int a = input.nextInt();
        System.out.print("B sayısını giriniz: ");
        int b = input.nextInt();

        int baslangic = Math.min(a, b);
        int bitis = Math.max(a, b);

        System.out.println("Aralarındaki sayılar:");
        for (int i = baslangic + 1; i < bitis; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}