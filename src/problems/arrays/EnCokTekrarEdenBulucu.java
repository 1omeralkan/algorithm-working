package problems.arrays;

public class EnCokTekrarEdenBulucu {
    public static void solve() {
        int[] veriler = {3, 5, 2, 5, 3, 5, 1, 8, 5};

        int enCokTekrarEden = veriler[0];
        int maxTekrarSayisi = 0;

        for (int i = 0; i < veriler.length; i++) {
            int anlikSayac = 0;
            for (int j = 0; j < veriler.length; j++) {
                if (veriler[i] == veriler[j]) {
                    anlikSayac++;
                }
            }
            if (anlikSayac > maxTekrarSayisi) {
                maxTekrarSayisi = anlikSayac;
                enCokTekrarEden = veriler[i];
            }
        }

        System.out.println("En çok tekrar eden eleman '" + enCokTekrarEden + "' (Toplam " + maxTekrarSayisi + " kere tekrar etmiş).");
    }
}