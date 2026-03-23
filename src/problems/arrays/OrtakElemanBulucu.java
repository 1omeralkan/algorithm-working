package problems.arrays;

public class OrtakElemanBulucu {
    public static void solve() {
        int[] dizi1 = {4, 7, 9, 12, 15, 22};
        int[] dizi2 = {5, 7, 12, 18, 22, 30};

        System.out.print("İki dizideki ortak elemanlar: ");

        boolean ortakBulundu = false;

        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi2.length; j++) {
                if (dizi1[i] == dizi2[j]) {
                    System.out.print(dizi1[i] + " ");
                    ortakBulundu = true;
                    break;
                }
            }
        }

        if (!ortakBulundu) {
            System.out.print("Ortak eleman yoktur.");
        }
        System.out.println();
    }
}