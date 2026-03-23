package problems.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SantiyeGirisSistemi {
    public static void solve() {

        List<String> gelenAraclar = new ArrayList<>();
        gelenAraclar.add("34 KEPCE 01");
        gelenAraclar.add("06 KAMYON 99");
        gelenAraclar.add("34 VINC 55");
        gelenAraclar.add("35 MIKSER 12");

        Map<String, String> istanbulAraclariMap = gelenAraclar.stream()
                .filter(plaka -> plaka.startsWith("34"))
                .collect(Collectors.toMap(
                        plaka -> plaka,
                        plaka -> "Giriş Onaylandı - Şantiye İçi"
                ));

        System.out.println("Sisteme Kaydedilen İstanbul (34) Araçları:");
        for (Map.Entry<String, String> kayit : istanbulAraclariMap.entrySet()) {
            System.out.println("Araç Plakası: " + kayit.getKey() + " -> Durum: " + kayit.getValue());
        }

        String sorgulananPlaka = "34 VINC 55";
        System.out.println("\n'" + sorgulananPlaka + "' plakalı araç sorgulanıyor: " +
                istanbulAraclariMap.getOrDefault(sorgulananPlaka, "Kayıt Yok, İçeri Alınamaz!"));
    }
}