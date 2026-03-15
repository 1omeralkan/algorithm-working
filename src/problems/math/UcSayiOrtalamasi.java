package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class UcSayiOrtalamasi {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("1. Sayı: "); double no1 = input.nextDouble();
        System.out.print("2. Sayı: "); double no2 = input.nextDouble();
        System.out.print("3. Sayı: "); double no3 = input.nextDouble();

        System.out.println("Ortalama: " + ((no1 + no2 + no3) / 3));
    }
}