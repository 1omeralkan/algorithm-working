package problems.conditions;

import utils.ScannerUtil;
import java.util.Scanner;

public class UcgenTipBulucu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("1. Kenarı giriniz: ");
        int kenar1 = input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        int kenar2 = input.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        int kenar3 = input.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eşkenar Üçgen");
        } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
            System.out.println("İkizkenar Üçgen");
        } else {
            System.out.println("Çeşitkenar Üçgen");
        }
    }
}