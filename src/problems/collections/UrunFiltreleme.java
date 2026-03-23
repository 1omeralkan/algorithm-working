package problems.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UrunFiltreleme {
    public static void solve() {
        // Ürün isimleri
        ArrayList<String> urunler = new ArrayList<>();
        urunler.add("Laptop");
        urunler.add("Telefon");
        urunler.add("Tablet");
        urunler.add("Kulaklık");
        urunler.add("Monitör");

        // Ürün fiyatları
        HashMap<String, Double> fiyatlar = new HashMap<>();
        fiyatlar.put("Laptop", 7500.0);
        fiyatlar.put("Telefon", 3500.0);
        fiyatlar.put("Tablet", 2500.0);
        fiyatlar.put("Kulaklık", 500.0);
        fiyatlar.put("Monitör", 1500.0);

        // Ürün stok adetleri
        HashMap<String, Integer> stoklar = new HashMap<>();
        stoklar.put("Laptop", 5);
        stoklar.put("Telefon", 0);
        stoklar.put("Tablet", 10);
        stoklar.put("Kulaklık", 25);
        stoklar.put("Monitör", 7);

        // Filtreleme: Stokta olan ve fiyatı 1000 ile 8000 arasındakiler
        List<String> filtrelenmisUrunler = urunler.stream()
                .filter(u -> stoklar.get(u) > 0)
                .filter(u -> fiyatlar.get(u) >= 1000 && fiyatlar.get(u) <= 8000)
                .sorted((u1, u2) -> {
                    int fiyatKarsilastir = fiyatlar.get(u1).compareTo(fiyatlar.get(u2));
                    if (fiyatKarsilastir != 0) {
                        return fiyatKarsilastir;
                    } else {
                        return u1.compareTo(u2);
                    }
                })
                .collect(Collectors.toList());

        System.out.println("Filtrelenmiş ürünler (stokta ve fiyat 1000-8000 aralığında):");
        filtrelenmisUrunler.forEach(System.out::println);

        // Toplam stok adedi
        int toplamStok = filtrelenmisUrunler.stream()
                .mapToInt(u -> stoklar.get(u))
                .sum();
        System.out.println("Toplam stok adedi: " + toplamStok);
    }
}