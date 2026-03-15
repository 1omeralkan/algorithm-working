package utils;

import java.util.Scanner;

public class ScannerUtil {
    // Şantiyede tek bir Scanner nesnesi üretiyoruz (Singleton mantığına giriş)
    private static final Scanner scanner = new Scanner(System.in);

    // Diğer class'lardan Scanner lazım olunca bu metodu çağıracağız
    public static Scanner getScanner() {
        return scanner;
    }

    // Tüm program bitince en son kapatmak için
    public static void closeScanner() {
        scanner.close();
    }
}