package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class SatisFiyatiHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Ürünün alış fiyatını giriniz: ");
        double alisFiyati = input.nextDouble();
        System.out.print("Vergi oranını giriniz (%): ");
        double vergiOrani = input.nextDouble();
        System.out.print("Kar oranını giriniz (%): ");
        double karOrani = input.nextDouble();

        double vergiliFiyat = alisFiyati + (alisFiyati * (vergiOrani / 100));
        double satisFiyati = vergiliFiyat + (vergiliFiyat * (karOrani / 100));
        System.out.println("Belirlenen Satış Fiyatı: " + satisFiyati);
    }
}