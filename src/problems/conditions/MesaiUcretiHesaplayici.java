package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class MesaiUcretiHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Çalışılan saati giriniz: ");
        int saat = input.nextInt();
        System.out.print("Saatlik ücreti giriniz: ");
        double ucret = input.nextDouble();

        double odenecekTutar = 0;
        if (saat < 40) {
            odenecekTutar = saat * ucret;
        } else {
            odenecekTutar = saat * (ucret * 2);
        }
        System.out.println("Ödenecek Toplam Tutar: " + odenecekTutar);
    }
}