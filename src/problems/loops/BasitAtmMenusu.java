package problems.loops;

import utils.ScannerUtil;
import java.util.Scanner;

public class BasitAtmMenusu {
    public static void solve() {
        Scanner input = ScannerUtil.getScanner();
        System.out.println("\n--- Soru 61: Basit ATM Menüsü ---");
        double bakiye = 0;
        boolean islemDevam = true;

        while (islemDevam) {
            System.out.println("\n--- ALKAN BANK ---");
            System.out.println("1- Para Yatır");
            System.out.println("2- Para Çek");
            System.out.println("3- Bakiye Sorgula");
            System.out.println("4- Çıkış");
            System.out.print("İşleminizi seçiniz: ");
            int secim = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yatırılacak tutar: ");
                    double yatan = input.nextDouble();
                    bakiye += yatan;
                    System.out.println("İşlem başarılı. Yeni bakiye: " + bakiye);
                    break;

                case 2:
                    System.out.print("Çekilecek tutar: ");
                    double cekilen = input.nextDouble();
                    if (cekilen > bakiye) {
                        System.out.println("Yetersiz bakiye!");
                    } else {
                        bakiye -= cekilen;
                        System.out.println("Lütfen paranızı alınız. Kalan bakiye: " + bakiye);
                    }
                    break;

                case 3:
                    System.out.println("Güncel Bakiyeniz: " + bakiye);
                    break;

                case 4:
                    System.out.println("Kartınızı almayı unutmayınız. İyi günler!");
                    islemDevam = false;
                    break;

                default:
                    System.out.println("Geçersiz işlem! Lütfen menüdeki numaralardan tuşlayınız.");
                    break;
            }
        }
    }
}