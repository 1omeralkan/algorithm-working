package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class NegatifGirileneKadarTopla {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int toplam = 0;

        while (true) {
            System.out.print("Toplanacak sayıyı giriniz (Durdurmak için negatif girin): ");
            int sayi = input.nextInt();

            if (sayi < 0) {
                break;
            }
            toplam += sayi;
        }
        System.out.println("Girilen pozitif sayıların toplamı: " + toplam);
    }
}