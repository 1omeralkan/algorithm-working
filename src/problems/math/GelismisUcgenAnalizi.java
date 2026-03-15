package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class GelismisUcgenAnalizi {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("1. Kenar: "); double k1 = input.nextDouble();
        System.out.print("2. Kenar: "); double k2 = input.nextDouble();
        System.out.print("3. Kenar: "); double k3 = input.nextDouble();

        if ((k1 + k2 > k3) && (k1 + k3 > k2) && (k2 + k3 > k1)) {
            System.out.println("Bu ölçülerle üçgen çizilebilir.");

            if (k1 == k2 && k2 == k3) System.out.println("Çeşit: Eşkenar");
            else if (k1 == k2 || k1 == k3 || k2 == k3) System.out.println("Çeşit: İkizkenar");
            else System.out.println("Çeşit: Çeşitkenar");

            double cevre = k1 + k2 + k3;
            double u = cevre / 2;
            double alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - k3));

            System.out.println("Çevre: " + cevre + " | Alan: " + alan);
        } else {
            System.out.println("Hata: Bu ölçülerle bir üçgen ÇİZİLEMEZ!");
        }
    }
}