package problems.arrays;

public class TrenBirlestirici {
    public static void solve() {
        int[] tren1 = {1, 3, 5};
        int[] tren2 = {2, 4, 6};

        int[] yeniTren = new int[tren1.length + tren2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < tren1.length && j < tren2.length) {
            if (tren1[i] < tren2[j]) {
                yeniTren[k++] = tren1[i++];
            } else {
                yeniTren[k++] = tren2[j++];
            }
        }

        while (i < tren1.length) {
            yeniTren[k++] = tren1[i++];
        }

        while (j < tren2.length) {
            yeniTren[k++] = tren2[j++];
        }

        System.out.print("Birleştirilmiş Sıralı Tren: ");
        for (int vagon : yeniTren) {
            System.out.print(vagon + " ");
        }
        System.out.println();
    }
}