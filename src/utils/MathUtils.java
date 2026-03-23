package utils;

public class MathUtils {

    // Vücut Kitle İndeksi Hesaplama Formülü
    public static double calculateVKI(double kilo, double boy) {
        return kilo / (boy * boy);
    }

    // KDV Ekleme Formülü (%18)
    public static double addKDV(double fiyat) {
        return fiyat + (fiyat * 0.18);
    }

    public static int gaussToplami(int n) {
        return (n * (n + 1)) / 2;
    }
}