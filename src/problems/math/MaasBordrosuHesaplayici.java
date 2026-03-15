package problems.math;

import utils.ScannerUtil;
import java.util.Scanner;

public class MaasBordrosuHesaplayici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.print("Sicil Numarası: ");
        String sicilNo = input.next();
        System.out.print("Çalışma Saati: ");
        double calismaSaati = input.nextDouble();
        System.out.print("Saatlik Ücret: ");
        double saatUcreti = input.nextDouble();

        double maas = calismaSaati * saatUcreti;
        System.out.println("Sicil No: " + sicilNo + " | Hesaplanmış Maaş: " + maas);
    }
}