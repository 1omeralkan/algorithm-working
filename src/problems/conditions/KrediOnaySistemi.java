package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class KrediOnaySistemi {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.print("Aylık maaşınızı giriniz: ");
        double maas = input.nextDouble();
        System.out.print("Kredi notunuzu giriniz (0-1900): ");
        int krediNotu = input.nextInt();

        if (yas >= 18 && maas > 15000 && krediNotu > 1100) {
            System.out.println("Kredi Onaylandı.");
        } else {
            System.out.println("Kredi Reddedildi.");
        }
    }
}