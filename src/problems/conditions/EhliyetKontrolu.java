package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class EhliyetKontrolu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Lütfen yaşınızı giriniz :");
        int yas = input.nextInt();

        if (yas >= 18) {
            System.out.println("Ehliyet alabilirsiniz!");
        } else {
            int gerekenYil = 18 - yas;
            System.out.println("Ehliyet alamazsınız, " + gerekenYil + " yıl daha beklemeniz gerekiyor.");
        }
    }
}