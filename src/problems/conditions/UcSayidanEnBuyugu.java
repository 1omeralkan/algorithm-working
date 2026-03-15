package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class UcSayidanEnBuyugu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("1. Sayı: "); int s1 = input.nextInt();
        System.out.print("2. Sayı: "); int s2 = input.nextInt();
        System.out.print("3. Sayı: "); int s3 = input.nextInt();

        int enBuyuk = s1;
        if (s2 > enBuyuk) enBuyuk = s2;
        if (s3 > enBuyuk) enBuyuk = s3;
        System.out.println("En büyük sayı: " + enBuyuk);
    }
}