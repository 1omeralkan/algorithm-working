package problems.arrays;

public class MaksimumKazancliBolge {
    public static void solve() {
        int[] zararlarVeKarlilar = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxToplam = Integer.MIN_VALUE;
        int anlikToplam = 0;

        for (int i = 0; i < zararlarVeKarlilar.length; i++) {
            anlikToplam = anlikToplam + zararlarVeKarlilar[i];

            if (anlikToplam > maxToplam) {
                maxToplam = anlikToplam;
            }

            if (anlikToplam < 0) {
                anlikToplam = 0;
            }
        }

        System.out.println("Şantiyede yan yana elde edilebilecek en yüksek kar: " + maxToplam);
    }
}