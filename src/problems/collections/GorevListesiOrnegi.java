package problems.collections;

import java.util.ArrayList;
import java.util.List;

class GorevListesiOrnegi {
    public static void solve() {

        List<String> aktifGorevler = new ArrayList<>();

        aktifGorevler.add("Temel betonu dökülecek");
        aktifGorevler.add("Demir sayımı yapılacak");
        aktifGorevler.add("Vinç bakımı");

        aktifGorevler.add(1, "ACİL: İş güvenliği toplantısı");

        aktifGorevler.remove("Vinç bakımı");

        System.out.println("Kalan Aktif Görev Sayısı: " + aktifGorevler.size());

        for (String gorev : aktifGorevler) {
            System.out.println("- " + gorev);
        }
    }
}