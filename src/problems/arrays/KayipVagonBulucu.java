package problems.arrays;

import utils.MathUtils; // Alet çantamızı çağırdık!

public class KayipVagonBulucu {
    public static void solve() {
        int[] vagonlar = {1, 2, 4, 5, 6};

        int n = 6;
        int gercekToplam = MathUtils.gaussToplami(n);

        int diziToplami = 0;
        for (int i = 0; i < vagonlar.length; i++) {
            diziToplami += vagonlar[i];
        }

        int kayipVagon = gercekToplam - diziToplami;
        System.out.println("Sistemdeki kayıp vagon numarası: " + kayipVagon);
    }
}