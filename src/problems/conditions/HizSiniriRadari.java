package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class HizSiniriRadari {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Hızınızı giriniz (km/s): ");
        int hiz = input.nextInt();

        if (hiz <= 90) {
            System.out.println("Hızınız normal, iyi yolculuklar.");
        } else if (hiz >= 91 && hiz <= 110) {
            System.out.println("Ceza: 1000 TL");
        } else if (hiz >= 111 && hiz <= 130) {
            System.out.println("Ceza: 2000 TL");
        } else if (hiz > 130) {
            System.out.println("Ehliyetinize el konuldu!");
        }
    }
}