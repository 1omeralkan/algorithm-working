package problems.arrays;

public class IkiVagonunSirri {
    public static void solve() {
        int[] sayilar = {2, 7, 11, 15};
        int hedef = 9;

        boolean bulunduMu = false;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] + sayilar[j] == hedef) {
                    System.out.println("Hedef (" + hedef + ") bulundu!");
                    System.out.println(i + ". indeks (" + sayilar[i] + ") + " + j + ". indeks (" + sayilar[j] + ")");
                    bulunduMu = true;
                    break;
                }
            }
            if (bulunduMu) break;
        }
    }
}