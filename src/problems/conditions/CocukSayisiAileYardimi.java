package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class CocukSayisiAileYardimi {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("İşçinin sabit maaşını giriniz: ");
        double maas = input.nextDouble();
        System.out.print("Çocuk sayısını giriniz: ");
        int cocukSayisi = input.nextInt();

        double ekYardim = 0;
        if (cocukSayisi == 1) ekYardim = maas * 0.05;
        else if (cocukSayisi == 2) ekYardim = maas * 0.10;
        else if (cocukSayisi >= 3) ekYardim = maas * 0.15;

        System.out.println("Toplam Maaş: " + (maas + ekYardim));
    }
}