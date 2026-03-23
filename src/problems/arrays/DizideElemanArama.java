package problems.arrays;

import utils.ScannerUtil;
import java.util.Scanner;

public class DizideElemanArama {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int[] sicilNolar = {101, 105, 108, 115, 120};
        System.out.print("Aranacak Sicil Numarasını Giriniz: ");
        int aranan = input.nextInt();

        boolean bulunduMu = false;

        for (int i = 0; i < sicilNolar.length; i++) {
            if (sicilNolar[i] == aranan) {
                bulunduMu = true;
                break;
            }
        }

        if (bulunduMu) {
            System.out.println("İşçi şantiyede mevcut.");
        } else {
            System.out.println("İşçi bulunamadı!");
        }
    }
}