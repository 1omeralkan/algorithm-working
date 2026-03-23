package problems.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiyatFiltrelemeOrnegi {
    public static void solve() {

        List<Double> fiyatlar = new ArrayList<>(List.of(300.0, 850.0, 150.0, 1200.0, 450.0));

        List<Double> kargoluFiyatlar = fiyatlar.stream()
                .filter(fiyat -> fiyat < 500)
                .map(fiyat -> fiyat * 1.10)
                .collect(Collectors.toList());

        System.out.println("Orijinal Fiyatlar: " + fiyatlar);
        System.out.println("500 TL altı olup zamlananlar: " + kargoluFiyatlar);
    }
}