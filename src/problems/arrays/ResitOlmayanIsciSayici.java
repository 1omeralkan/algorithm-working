package problems.arrays;

public class ResitOlmayanIsciSayici {
    public static void solve() {
        int[] yaslar = {22, 17, 35, 16, 40, 29, 15, 18};
        int sayac = 0;

        for (int i = 0; i < yaslar.length; i++) {
            if (yaslar[i] < 18) {
                sayac++;
            }
        }

        System.out.println("Şantiyedeki 18 yaşından küçük (reşit olmayan) işçi sayısı: " + sayac);
    }
}