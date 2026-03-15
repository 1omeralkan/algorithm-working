package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class TersYildizUcgeni {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Kaç satırlık ters üçgen çizilsin?: ");
        int satirSayisi = input.nextInt();

        for (int satir = satirSayisi; satir >= 1; satir--) {
            for (int yildiz = 1; yildiz <= satir; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}