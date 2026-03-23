package problems.arrays;

public class ArrayDuplicateFinder {
    public static void solve() {
        int[] sayilar = {4, 7, 2, 7, 9, 4, 10};

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] == sayilar[j]) {
                    System.out.println("Tekrar eden: " + sayilar[i]);
                }
            }
        }

    }
}