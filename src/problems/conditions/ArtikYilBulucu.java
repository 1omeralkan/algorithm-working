package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class ArtikYilBulucu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Bir yıl giriniz (Örn: 2024): ");
        int yil = input.nextInt();

        // 4'e tam bölünmeli VE 100'e bölünmemeli VEYA 400'e tam bölünmeli
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir Artık Yıldır.");
        } else {
            System.out.println(yil + " bir Artık Yıl DEĞİLDİR.");
        }
    }
}