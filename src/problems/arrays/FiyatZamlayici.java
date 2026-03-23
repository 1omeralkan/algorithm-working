package problems.arrays;

public class FiyatZamlayici {
    public static void solve() {
        double[] fiyatlar = {100.0, 250.0, 50.0, 400.0};

        System.out.println("Eski ve Zamlı Fiyat Listesi:");

        for (int i = 0; i < fiyatlar.length; i++) {
            double eskiFiyat = fiyatlar[i];

            fiyatlar[i] = fiyatlar[i] + (fiyatlar[i] * 0.10);

            System.out.println(i + ". Ürün: Eski Fiyat = " + eskiFiyat + " TL -> Yeni Fiyat = " + fiyatlar[i] + " TL");
        }
    }
}