package problems.arrays;

import utils.ScannerUtil;
import java.util.Scanner;

public class VagonKaydirici {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        int[] dizi = {1, 2, 3, 4, 5};
        System.out.print("Vagonlar kaç adım sağa kaydırılsın?: ");
        int k = input.nextInt();

        k = k % dizi.length;

        for (int adim = 0; adim < k; adim++) {
            int sonEleman = dizi[dizi.length - 1];

            for (int i = dizi.length - 1; i > 0; i--) {
                dizi[i] = dizi[i - 1];
            }
            dizi[0] = sonEleman;
        }

        System.out.print("Kaydırılmış Tren: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
    }
}