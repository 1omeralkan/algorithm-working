package problems.arrays;

import java.util.Scanner;

public class ArraySearchElement {
    public static void solve() {
        int[] sayilar = {5, 12, 7, 20, 33};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranan elemanı girin: ");
        int aranan = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranan) {
                index = i;
                break;
            }
        }

        System.out.println("Sonuç: " + index);
    }
}