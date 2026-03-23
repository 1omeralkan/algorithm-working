package problems.arrays;

public class ArrayMinMaxFinder {
    public static void solve() {
        int[] sayilar = {12, 45, 7, 89, 23};

        int min = sayilar[0];
        int max = sayilar[0];

        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
        }

        System.out.println("En küçük: " + min);
        System.out.println("En büyük: " + max);
    }
}