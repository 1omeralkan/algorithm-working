package problems.collections;

import java.util.ArrayList;
import java.util.List;

public class ListKullanimi {
    public static void solve() {
        List<String> yazilimDilleri = new ArrayList<>();

        // Veri Ekleme (Add)
        yazilimDilleri.add("Java");
        yazilimDilleri.add("Python");
        yazilimDilleri.add("C#");

        // Araya Veri Ekleme
        yazilimDilleri.add(1, "Go"); // Python ve sonrasını sağa kaydırır

        // Veri Okuma (Get)
        System.out.println("2. İndeksteki Dil: " + yazilimDilleri.get(2));

        // Veri Silme (Remove)
        yazilimDilleri.remove("C#");

        // Listeyi Ekrana Yazdırma
        System.out.println("\nGüncel Dil Listesi:");
        for (String dil : yazilimDilleri) {
            System.out.println("- " + dil);
        }
    }
}