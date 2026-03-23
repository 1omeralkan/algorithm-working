package problems.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class OgrenciFiltrelemeOrnegi {
    public static void solve() {
        // ArrayList: Öğrenci isimleri
        ArrayList<String> ogrenciler = new ArrayList<>();
        ogrenciler.add("Ali");
        ogrenciler.add("Veli");
        ogrenciler.add("Ayşe");
        ogrenciler.add("Fatma");

        // HashMap: Öğrenci adı -> yaş
        HashMap<String, Integer> yaslar = new HashMap<>();
        yaslar.put("Ali", 19);
        yaslar.put("Veli", 22);
        yaslar.put("Ayşe", 21);
        yaslar.put("Fatma", 18);

        // Stream: 20 yaşından büyükleri filtrele ve alfabetik sırala
        List<String> sonuc = ogrenciler.stream()
                .filter(isim -> yaslar.get(isim) > 20)   // koşul
                .sorted()                               // alfabetik sıralama
                .collect(Collectors.toList());          // listeye çevir

        System.out.println("20 yaşından büyük öğrenciler:");
        sonuc.forEach(System.out::println);
    }
}