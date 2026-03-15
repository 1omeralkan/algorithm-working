package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class ArmstrongSayisi {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("3 basamaklı bir sayı giriniz: ");
        int armstrongAdayi = input.nextInt();
        int temp = armstrongAdayi;
        int kupToplam = 0;

        while (temp > 0) {
            int basamak = temp % 10;
            kupToplam = kupToplam + (basamak * basamak * basamak);
            temp = temp / 10;
        }

        if (kupToplam == armstrongAdayi) {
            System.out.println(armstrongAdayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(armstrongAdayi + " Armstrong sayısı değildir.");
        }
    }
}