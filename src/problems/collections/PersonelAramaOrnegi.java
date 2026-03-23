package problems.collections;

import java.util.HashMap;
import java.util.Map;

public class PersonelAramaOrnegi {
    public static void solve() {
        Map<Integer, String> personelHaritasi = new HashMap<>();
        personelHaritasi.put(101, "Ali Yılmaz");
        personelHaritasi.put(105, "Ayşe Demir");
        personelHaritasi.put(108, "Mehmet Çelik");

        personelHaritasi.putIfAbsent(101, "Kaan Usta");

        int arananSicil = 105;

        String personelAd = personelHaritasi.getOrDefault(arananSicil, "Kayıt Bulunamadı!");
        System.out.println("Aranan Sicil (" + arananSicil + "): " + personelAd);

        System.out.println("\nŞantiyedeki Tüm Personeller:");
        for (Map.Entry<Integer, String> kayit : personelHaritasi.entrySet()) {
            System.out.println("Sicil: " + kayit.getKey() + " | İsim: " + kayit.getValue());
        }
    }
}