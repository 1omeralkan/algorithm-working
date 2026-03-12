import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Ornek1 İki Sayıdan Büyük Olanı Bulma
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("Büyük olan sayı: " + sayi1);
        } else if (sayi2 > sayi1) {
            System.out.println("Büyük olan sayı: " + sayi2);
        } else {
            System.out.println("Sayılar birbirine eşittir.");
        }
        */

        /* Ornek2 Sıfır, Pozitif veya Negatif Kontrolü
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi > 0) {
            System.out.println("Sayı Pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Sayı Negatiftir.");
        } else {
            System.out.println("Sayı Sıfırdır.");
        }
        */

        /* Ornek3 Fiyat Üzerine %18 KDV Ekleme
        System.out.print("Fiyatı giriniz: ");
        double fiyat = input.nextDouble();
        double kdvliFiyat = fiyat + (fiyat * 0.18);
        System.out.println("KDV dahil fiyat: " + kdvliFiyat);
        */

        /* Ornek4 Beş Sayının Toplamı ve Ortalaması
        double toplam = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            toplam += input.nextDouble();
        }
        double ortalama = toplam / 5;
        System.out.println("Toplam: " + toplam + " | Ortalama: " + ortalama);
        */

        /* Ornek5 Fahrenheit - Santigrat Çevirici
        System.out.print("Fahrenheit değerini giriniz: ");
        double fahrenheit = input.nextDouble();
        double derece = (fahrenheit - 32) / 1.8;
        System.out.println("Santigrat karşılığı: " + derece);
        */

        /* Ornek6 2. Dereceden Denklem Kökleri (ax^2 + bx + c = 0)
        System.out.print("a değerini giriniz: ");
        double a = input.nextDouble();
        System.out.print("b değerini giriniz: ");
        double b = input.nextDouble();
        System.out.print("c değerini giriniz: ");
        double c = input.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double kok1 = (-b + Math.sqrt(delta)) / (2 * a);
            double kok2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("İki farklı kök var: X1=" + kok1 + ", X2=" + kok2);
        } else if (delta == 0) {
            double kok = -b / (2 * a);
            System.out.println("Çakışık tek kök var: X=" + kok);
        } else {
            System.out.println("Reel kök yoktur (Delta < 0).");
        }
        */

        /* Ornek7 Vergi ve Kar Oranlı Satış Fiyatı
        System.out.print("Ürünün alış fiyatını giriniz: ");
        double alisFiyati = input.nextDouble();
        System.out.print("Vergi oranını giriniz (%): ");
        double vergiOrani = input.nextDouble();
        System.out.print("Kar oranını giriniz (%): ");
        double karOrani = input.nextDouble();

        double vergiliFiyat = alisFiyati + (alisFiyati * (vergiOrani / 100));
        double satisFiyati = vergiliFiyat + (vergiliFiyat * (karOrani / 100));
        System.out.println("Belirlenen Satış Fiyatı: " + satisFiyati);
        */

        /* Ornek8 Üçgen Alanı Hesaplama
        System.out.print("Taban uzunluğunu giriniz: ");
        double taban = input.nextDouble();
        System.out.print("Yüksekliği giriniz: ");
        double yukseklik = input.nextDouble();

        double alan = (taban * yukseklik) / 2;
        System.out.println("Üçgenin Alanı: " + alan);
        */

        /* Ornek9 Gerilim (V = I * R) Hesaplama
        System.out.print("Akım (I) değerini giriniz: ");
        double akim = input.nextDouble();
        System.out.print("Direnç (R) değerini giriniz: ");
        double direnc = input.nextDouble();

        double gerilim = akim * direnc;
        System.out.println("Kutuplar arası gerilim (V): " + gerilim);
        */

        /* Ornek10 İki Not ve Bir Sözlü ile Geçti/Kaldı
        System.out.print("1. Sınav Notu: ");
        double not1 = input.nextDouble();
        System.out.print("2. Sınav Notu: ");
        double not2 = input.nextDouble();
        System.out.print("Sözlü Notu: ");
        double sozlu = input.nextDouble();

        double ortalama = (not1 + not2 + sozlu) / 3;

        if (ortalama >= 50) {
            System.out.println("Ortalamanız " + ortalama + " -> GEÇTİ");
        } else {
            System.out.println("Ortalamanız " + ortalama + " -> KALDI");
        }
        */

        /* Ornek11 Vize/Final Ağırlaştırılmış Geçme Şartı
        System.out.print("Vize notunuz: ");
        double vize = input.nextDouble();
        System.out.print("Final notunuz: ");
        double finalNotu = input.nextDouble();

        double ortalama = (vize * 0.30) + (finalNotu * 0.70);

        if (ortalama >= 50 && finalNotu >= 50) {
            System.out.println("Ortalama: " + ortalama + " - Geçtiniz.");
        } else {
            System.out.println("Ortalama: " + ortalama + " - Kaldınız. (Final min 50 olmalı ve Ort min 50 olmalı)");
        }
        */

        /* Ornek12 Suyun Maddesel Hali
        System.out.print("Suyun sıcaklığını giriniz: ");
        double sicaklik = input.nextDouble();

        if (sicaklik <= 0) {
            System.out.println("Madde KATI haldedir.");
        } else if (sicaklik >= 100) {
            System.out.println("Madde GAZ haldedir.");
        } else {
            System.out.println("Madde SIVI haldedir.");
        }
        */

        /* Ornek13 0 - 99.999 Arası Sayının Basamak Sayısı
        System.out.print("0 ile 99.999 arası bir sayı giriniz: ");
        int sayi = input.nextInt();
        int basamakSayisi = 0;

        if (sayi == 0) {
            basamakSayisi = 1;
        } else {
            while (sayi > 0) {
                sayi = sayi / 10;
                basamakSayisi++;
            }
        }
        System.out.println("Girdiğiniz sayı " + basamakSayisi + " basamaklıdır.");
        */

        /* Ornek14 Çocuk Sayısına Göre Aile Yardımı
        System.out.print("İşçinin sabit maaşını giriniz: ");
        double maas = input.nextDouble();
        System.out.print("Çocuk sayısını giriniz: ");
        int cocukSayisi = input.nextInt();

        double ekYardim = 0;
        if (cocukSayisi == 1) ekYardim = maas * 0.05;
        else if (cocukSayisi == 2) ekYardim = maas * 0.10;
        else if (cocukSayisi >= 3) ekYardim = maas * 0.15;

        System.out.println("Toplam Maaş: " + (maas + ekYardim));
        */

        /* Ornek15 Çifte Mesai Ücreti Hesaplama
        System.out.print("Çalışılan saati giriniz: ");
        int saat = input.nextInt();
        System.out.print("Saatlik ücreti giriniz: ");
        double ucret = input.nextDouble();

        double odenecekTutar = 0;
        if (saat < 40) {
            odenecekTutar = saat * ucret;
        } else {
            odenecekTutar = saat * (ucret * 2);
        }
        System.out.println("Ödenecek Toplam Tutar: " + odenecekTutar);
        */

        /* Ornek16 Sicil Numaralı Maaş Bordrosu
        System.out.print("Sicil Numarası: ");
        String sicilNo = input.next();
        System.out.print("Çalışma Saati: ");
        double calismaSaati = input.nextDouble();
        System.out.print("Saatlik Ücret: ");
        double saatUcreti = input.nextDouble();

        double maas = calismaSaati * saatUcreti;
        System.out.println("Sicil No: " + sicilNo + " | Hesaplanmış Maaş: " + maas);
        */

        /* Ornek17 1'den N'e Kadar Karmaşık Toplam ve Çarpım
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        int tekToplam = 0, ciftKareToplam = 0;
        long tekCarpim = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ciftKareToplam += (i * i);
            } else {
                tekToplam += i;
                tekCarpim *= i;
            }
        }
        System.out.println("Teklerin Toplamı: " + tekToplam);
        System.out.println("Teklerin Çarpımı: " + tekCarpim);
        System.out.println("Çiftlerin Kareleri Toplamı: " + ciftKareToplam);
        */

        /* Ornek18 Peş Peşe 10 Sayıyı Toplama
        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            toplam += input.nextInt();
        }
        System.out.println("Girilen 10 sayının toplamı: " + toplam);
        */

        /* Ornek19 İki Sayı Arasındaki Sayıları Listeleme
        System.out.print("A sayısını giriniz: ");
        int a = input.nextInt();
        System.out.print("B sayısını giriniz: ");
        int b = input.nextInt();

        int baslangic = Math.min(a, b);
        int bitis = Math.max(a, b);

        System.out.println("Aralarındaki sayılar:");
        for (int i = baslangic + 1; i < bitis; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        */

        /* Ornek20 İşçi Parça Sayısı ve Aile Durumu Primi
        System.out.print("Sabit Maaş: ");
        double maas = input.nextDouble();
        System.out.print("Çocuk Sayısı: ");
        int cocuk = input.nextInt();
        System.out.print("Ürettiği Parça Sayısı: ");
        int parca = input.nextInt();

        double cocukYardimi = cocuk * 250;
        double parcaPrimi = (parca > 100) ? (parca - 100) * 50 : 0;

        double toplamMaas = maas + cocukYardimi + parcaPrimi;
        System.out.println("Hesaplanan Toplam Maaş: " + toplamMaas);
        */

        /* Ornek21 Gelişmiş Üçgen Analizi
        System.out.print("1. Kenar: "); double k1 = input.nextDouble();
        System.out.print("2. Kenar: "); double k2 = input.nextDouble();
        System.out.print("3. Kenar: "); double k3 = input.nextDouble();

        if ((k1 + k2 > k3) && (k1 + k3 > k2) && (k2 + k3 > k1)) {
            System.out.println("Bu ölçülerle üçgen çizilebilir.");

            if (k1 == k2 && k2 == k3) System.out.println("Çeşit: Eşkenar");
            else if (k1 == k2 || k1 == k3 || k2 == k3) System.out.println("Çeşit: İkizkenar");
            else System.out.println("Çeşit: Çeşitkenar");

            double cevre = k1 + k2 + k3;
            double u = cevre / 2;
            double alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - k3));

            System.out.println("Çevre: " + cevre + " | Alan: " + alan);
        } else {
            System.out.println("Hata: Bu ölçülerle bir üçgen ÇİZİLEMEZ!");
        }
        */

        /* Ornek22 Pozitif, Negatif ve Sıfır Sayıcı
        int pozitifCount = 0, negatifCount = 0, sifirCount = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            if (sayi > 0) pozitifCount++;
            else if (sayi < 0) negatifCount++;
            else sifirCount++;
        }
        System.out.println("Pozitif: " + pozitifCount + " | Negatif: " + negatifCount + " | Sıfır: " + sifirCount);
        */

        /* Ornek23 Kürenin Alanı ve Hacmi
        System.out.print("Kürenin yarıçapını (r) giriniz: ");
        double r = input.nextDouble();
        double pi = Math.PI;

        double alan = 4 * pi * Math.pow(r, 2);
        double hacim = (4.0 / 3.0) * pi * Math.pow(r, 3);
        System.out.println("Kürenin Alanı: " + alan + " | Hacmi: " + hacim);
        */

        /* Ornek24 Silindirin Alanı ve Hacmi
        System.out.print("Silindirin yarıçapını (r) giriniz: ");
        double rSil = input.nextDouble();
        System.out.print("Silindirin yüksekliğini (h) giriniz: ");
        double hSil = input.nextDouble();
        double piSil = Math.PI;

        double alanSil = 2 * piSil * rSil * (rSil + hSil);
        double hacimSil = piSil * Math.pow(rSil, 2) * hSil;
        System.out.println("Silindirin Alanı: " + alanSil + " | Hacmi: " + hacimSil);
        */

        /* Ornek25 Üç Sayıdan En Büyüğünü Bulma
        System.out.print("1. Sayı: "); int s1 = input.nextInt();
        System.out.print("2. Sayı: "); int s2 = input.nextInt();
        System.out.print("3. Sayı: "); int s3 = input.nextInt();

        int enBuyuk = s1;
        if (s2 > enBuyuk) enBuyuk = s2;
        if (s3 > enBuyuk) enBuyuk = s3;
        System.out.println("En büyük sayı: " + enBuyuk);
        */

        /* Ornek26 7-24 Arası Tek Sayılar Toplamı ve Ortalaması
        int toplam = 0;
        int adet = 0;

        for (int i = 7; i <= 24; i++) {
            if (i % 2 != 0) {
                toplam += i;
                adet++;
            }
        }
        System.out.println("Tek Sayılar Toplamı: " + toplam + " | Ortalaması: " + ((double) toplam / adet));
        */

        /* Ornek27 Girilen 3 Sayının Ortalaması
        System.out.print("1. Sayı: "); double no1 = input.nextDouble();
        System.out.print("2. Sayı: "); double no2 = input.nextDouble();
        System.out.print("3. Sayı: "); double no3 = input.nextDouble();
        System.out.println("Ortalama: " + ((no1 + no2 + no3) / 3));
        */

        /* Ornek28 1-40 Arası 5'in Katları
        System.out.println("1-40 arası 5'in katları:");
        for (int i = 1; i <= 40; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        */

        /* Ornek29 Çarpma Kullanmadan 3 Katını Bulma
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int ucKati = sayi + sayi + sayi;
        System.out.println("Sayının 3 katı: " + ucKati);
        */

        /* Ornek30 Paralelkenar Alanı
        System.out.print("Taban uzunluğu: ");
        double taban = input.nextDouble();
        System.out.print("Yükseklik: ");
        double yukseklik = input.nextDouble();
        System.out.println("Paralelkenarın Alanı: " + (taban * yukseklik));
        */

        /* Ornek31 10 Sayının Ortalaması ve Uç Değerler Ortalama Farkı
        double toplam = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            double girilen = input.nextDouble();
            toplam += girilen;
            if (girilen < min) min = girilen;
            if (girilen > max) max = girilen;
        }

        double genelOrtalama = toplam / 10;
        double ucDegerOrtalamasi = (min + max) / 2;
        double fark = Math.abs(genelOrtalama - ucDegerOrtalamasi);
        System.out.println("Genel Ortalama: " + genelOrtalama + " | Uç Ortalama: " + ucDegerOrtalamasi);
        System.out.println("Aradaki Fark: " + fark);
        */

        /* Ornek32 10-15 Arası Olmadığı Sürece Sayı İsteyen İnatçı Döngü
        int sayi = 0;
        do {
            System.out.print("Lütfen 10 ile 15 arasında bir sayı giriniz: ");
            sayi = input.nextInt();
        } while (sayi < 10 || sayi > 15);
        System.out.println("Tebrikler, aralıkta bir sayı girdiniz!");
        */

        /* Ornek33 1'den 25'e Kadar Kareler Toplamı
        long kareToplam = 0;
        for (int i = 1; i <= 25; i++) {
            kareToplam += (i * i);
        }
        System.out.println("1-25 arası sayıların kareleri toplamı: " + kareToplam);
        */

        /* Ornek34 10 Sayıdan Kaç Tanesi Negatif
        int negatifAdet = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            if (input.nextInt() < 0) {
                negatifAdet++;
            }
        }
        System.out.println("Girilen sayılardan " + negatifAdet + " tanesi negatiftir.");
        */

        /* Ornek35 Sayıya Göre Ay İsmi Bulma (Switch-Case)
        System.out.print("1 ile 12 arası bir ay numarası giriniz: ");
        int ay = input.nextInt();
        switch (ay) {
            case 1: System.out.println("Ocak"); break;
            case 2: System.out.println("Şubat"); break;
            case 3: System.out.println("Mart"); break;
            case 4: System.out.println("Nisan"); break;
            case 5: System.out.println("Mayıs"); break;
            case 6: System.out.println("Haziran"); break;
            case 7: System.out.println("Temmuz"); break;
            case 8: System.out.println("Ağustos"); break;
            case 9: System.out.println("Eylül"); break;
            case 10: System.out.println("Ekim"); break;
            case 11: System.out.println("Kasım"); break;
            case 12: System.out.println("Aralık"); break;
            default: System.out.println("Geçersiz ay numarası!");
        }
        */

        /* Ornek36 Negatif Sayı Girilene Kadar Toplama
        int toplam = 0;
        while (true) {
            System.out.print("Toplanacak sayıyı giriniz (Durdurmak için negatif girin): ");
            int sayi = input.nextInt();
            if (sayi < 0) {
                break;
            }
            toplam += sayi;
        }
        System.out.println("Girilen pozitif sayıların toplamı: " + toplam);
        */

        /* Ornek37 60km Hızla Mesafeye Göre Süre Hesaplama
        System.out.print("Gidilecek mesafeyi (km) giriniz: ");
        double mesafe = input.nextDouble();
        int hiz = 60;

        double sure = mesafe / hiz;
        System.out.println("Araç " + mesafe + " km yolu " + sure + " saatte gider.");
        */

        /* Ornek38 Vücut Kitle İndeksi (VKİ) Hesaplayıcı
        System.out.print("Lütfen kilonuzu giriniz (kg) :");
        double kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz (m) :");
        double boy = input.nextDouble();
        double vki = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + vki);
        */

        /* Ornek39 Ehliyet Kontrol Noktası
        System.out.print("Lütfen yaşınızı giriniz :");
        int yas = input.nextInt();
        if (yas >= 18) {
            System.out.println("Ehliyet alabilirsiniz!");
        } else {
            int gerekenYil = 18 - yas;
            System.out.println("Ehliyet alamazsınız, " + gerekenYil + " yıl daha beklemeniz gerekiyor.");
        }
        */

        /* Ornek40 Çift Sayı
        System.out.print("Bir tam sayı giriniz :");
        int tamSayi = input.nextInt();
        for (int i = 1; i <= tamSayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        */

        /* Ornek41 Arsa Alan ve Çevre Hesaplayıcı
        System.out.print("Kısa kenarı giriniz :");
        double kisaKenar = input.nextDouble();
        System.out.print("Uzun kenarı giriniz :");
        double uzunKenar = input.nextDouble();
        double alan = uzunKenar * kisaKenar;
        System.out.println("Alan : " + alan);
        */

        /* Ornek42 Sabit İndirim Kasası
        System.out.print("Lütfen ürün fiyatını giriniz :");
        double fiyat = input.nextDouble();
        double netFiyat = fiyat - (fiyat * 0.2);
        System.out.println("İndirimli fiyat : " + netFiyat);
        */

        /* Ornek43 Tek mi, Çift mi? (Klasik)
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Girdiğiniz sayı çift.");
        } else {
            System.out.println("Girdiğiniz sayı tek.");
        }
        */

        /* Ornek44 Vize ve Final Notu Sistemi
        System.out.print("Vize notunuzu giriniz :");
        double vize = input.nextDouble();
        System.out.print("Final notunuzu giriniz :");
        double finalNotu = input.nextDouble();
        double ortalama = (vize * 0.4) + (finalNotu * 0.6);
        if (ortalama >= 50) {
            System.out.println("Tebrikler, geçtiniz! Ortalamanız: " + ortalama);
        } else {
            System.out.println("Kaldınız, seneye bekleriz. Ortalamanız: " + ortalama);
        }
        */

        /* Ornek45 Şifre Kontrol Kapısı
        int dogruSifre = 1234;
        System.out.print("Lütfen şifrenizi giriniz :");
        int girilenSifre = input.nextInt();

        if (girilenSifre == dogruSifre) {
            System.out.println("Giriş Başarılı.");
        } else {
            System.out.println("Hatalı Şifre!");
        }
        */

        /* Ornek46 Kelime Tekrarlayıcı
        System.out.print("Lütfen bir kelime giriniz :");
        String kelime = input.next();

        System.out.print("Kaç kere tekrarlansın? :");
        int tekrarSayisi = input.nextInt();

        for (int i = 0; i < tekrarSayisi; i++) {
            System.out.println(kelime);
        }
        */

        /* Ornek47 Sayıların Toplamı
        System.out.print("Bir tam sayı giriniz :");
        int sayi = input.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayi; i++) {
            toplam = toplam + i;
        }

        System.out.println("1'den " + sayi + "'e kadar olan sayıların toplamı: " + toplam);
        */

        /* Ornek48 Kredi Onay Sistemi
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.print("Aylık maaşınızı giriniz: ");
        double maas = input.nextDouble();
        System.out.print("Kredi notunuzu giriniz (0-1900): ");
        int krediNotu = input.nextInt();

        if (yas >= 18 && maas > 15000 && krediNotu > 1100) {
            System.out.println("Kredi Onaylandı.");
        } else {
            System.out.println("Kredi Reddedildi.");
        }
        */


        /* Ornek49 Gelişmiş Hesap Makinesi
        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.print("İşlem türünü giriniz (+, -, *, /): ");
        String islem = input.next();

        if (islem.equals("+")) {
            System.out.println("Sonuç: " + (sayi1 + sayi2));
        } else if (islem.equals("-")) {
            System.out.println("Sonuç: " + (sayi1 - sayi2));
        } else if (islem.equals("*")) {
            System.out.println("Sonuç: " + (sayi1 * sayi2));
        } else if (islem.equals("/")) {
            if (sayi2 == 0) {
                System.out.println("Hata: Bir sayı sıfıra bölünemez!");
            } else {
                System.out.println("Sonuç: " + (sayi1 / sayi2));
            }
        } else {
            System.out.println("Geçersiz işlem girdiniz!");
        }
        */


        /* Ornek50 Üçgen Analiz Robotu
        System.out.print("1. Kenarı giriniz: ");
        int kenar1 = input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        int kenar2 = input.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        int kenar3 = input.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eşkenar Üçgen");
        } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
            System.out.println("İkizkenar Üçgen");
        } else {
            System.out.println("Çeşitkenar Üçgen");
        }
        */


        /* Ornek51 Hız Sınırı Radarı
        System.out.print("Hızınızı giriniz (km/s): ");
        int hiz = input.nextInt();

        if (hiz <= 90) {
            System.out.println("Hızınız normal, iyi yolculuklar.");
        } else if (hiz >= 91 && hiz <= 110) {
            System.out.println("Ceza: 1000 TL");
        } else if (hiz >= 111 && hiz <= 130) {
            System.out.println("Ceza: 2000 TL");
        } else if (hiz > 130) {
            System.out.println("Ehliyetinize el konuldu!");
        }
        */


        /* Ornek52 Artık Yıl  Bulucu
        System.out.print("Bir yıl giriniz (Örn: 2024): ");
        int yil = input.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir Artık Yıldır.");
        } else {
            System.out.println(yil + " bir Artık Yıl DEĞİLDİR.");
        }
        */


        /* Ornek53 Asal Sayı Dedektörü
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        boolean asalMi = true;

        if (sayi < 2) {
            asalMi = false;
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        }

        if (asalMi) {
            System.out.println(sayi + " Asal bir sayıdır.");
        } else {
            System.out.println(sayi + " Asal sayı değildir.");
        }
        */


        /* Ornek54 ATM Şifre Deneme
        int dogruSifre = 1234;
        int hak = 3;

        while (hak > 0) {
            System.out.print("Şifrenizi giriniz: ");
            int girilen = input.nextInt();

            if (girilen == dogruSifre) {
                System.out.println("Giriş başarılı! Hoş geldiniz.");
                break;
            } else {
                hak--;
                if (hak > 0) {
                    System.out.println("Yanlış şifre! Kalan hakkınız: " + hak);
                } else {
                    System.out.println("Kartınız bloke oldu! Şubeye gidiniz.");
                }
            }
        }
        */


        /* Ornek55 Faktöriyel Hesaplama
        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
        int faktoriyelSayi = input.nextInt();
        int carpim = 1;

        for (int i = 1; i <= faktoriyelSayi; i++) {
            carpim = carpim * i;
        }

        System.out.println(faktoriyelSayi + "! = " + carpim);
        */


        /* Ornek56 Yıldızlarla Dik Üçgen Çizme
        System.out.println("Yıldız Üçgeni:");
        for (int satir = 1; satir <= 5; satir++) {
            for (int yildiz = 1; yildiz <= satir; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /* Ornek57 Fibonacci Serisi
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Serisi: " + a + " " + b);

        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
        */

        /* Ornek58 Harf Notu Çevirici
        System.out.print("Öğrencinin notunu giriniz (0-100): ");
        int not = input.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Geçersiz Not! Lütfen 0 ile 100 arasında giriniz.");
        } else if (not >= 90) {
            System.out.println("Harf Notunuz: AA");
        } else if (not >= 80) {
            System.out.println("Harf Notunuz: BA");
        } else if (not >= 70) {
            System.out.println("Harf Notunuz: BB");
        } else if (not >= 60) {
            System.out.println("Harf Notunuz: CB");
        } else if (not >= 50) {
            System.out.println("Harf Notunuz: CC");
        } else {
            System.out.println("Harf Notunuz: FF (Kaldınız)");
        }
        */


        /* Ornek59 Çarpım Tablosu
        System.out.print("Çarpım tablosu için 1 ile 10 arası bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(sayi + " Sayısının Çarpım Tablosu:");
        for (int i = 1; i <= 10; i++) {
            int sonuc = sayi * i;
            System.out.println(sayi + " x " + i + " = " + sonuc);
        }
        */


        /* Ornek60 Üs Alma Motoru
        System.out.print("Taban sayısını giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int us = input.nextInt();

        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc = sonuc * taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);
        */


        /* Ornek61 Mükemmel Sayı Dedektörü
        System.out.print("Kontrol edilecek sayıyı giriniz: ");
        int mukemmelSayi = input.nextInt();
        int bolenlerinToplami = 0;

        for (int i = 1; i < mukemmelSayi; i++) {
            if (mukemmelSayi % i == 0) {
                bolenlerinToplami = bolenlerinToplami + i;
            }
        }

        if (bolenlerinToplami == mukemmelSayi) {
            System.out.println(mukemmelSayi + " bir Mükemmel Sayıdır!");
        } else {
            System.out.println(mukemmelSayi + " Mükemmel Sayı değildir.");
        }
        */


        /* Ornek62 Basit ATM Menüsü
        double bakiye = 0;

        while (true) {
            System.out.println("\n--- ALKAN BANK ---");
            System.out.println("1- Para Yatır");
            System.out.println("2- Para Çek");
            System.out.println("3- Bakiye Sorgula");
            System.out.println("4- Çıkış");
            System.out.print("İşleminizi seçiniz: ");
            int secim = input.nextInt();

            if (secim == 1) {
                System.out.print("Yatırılacak tutar: ");
                double yatan = input.nextDouble();
                bakiye += yatan;
                System.out.println("İşlem başarılı. Yeni bakiye: " + bakiye);
            } else if (secim == 2) {
                System.out.print("Çekilecek tutar: ");
                double cekilen = input.nextDouble();
                if (cekilen > bakiye) {
                    System.out.println("Yetersiz bakiye!");
                } else {
                    bakiye -= cekilen;
                    System.out.println("Lütfen paranızı alınız. Kalan bakiye: " + bakiye);
                }
            } else if (secim == 3) {
                System.out.println("Güncel Bakiyeniz: " + bakiye);
            } else if (secim == 4) {
                System.out.println("Kartınızı almayı unutmayınız. İyi günler!");
                break;
            } else {
                System.out.println("Geçersiz işlem! Lütfen menüdeki numaralardan tuşlayınız.");
            }
        }
        */


        /* Ornek63 Rakamlar Toplamı
        System.out.print("Bir sayı giriniz (Örn: 456): ");
        int girilenSayi = input.nextInt();
        int geciciSayi = girilenSayi;
        int rakamToplami = 0;

        while (geciciSayi > 0) {
            int sonRakam = geciciSayi % 10;
            rakamToplami = rakamToplami + sonRakam;
            geciciSayi = geciciSayi / 10;
        }

        System.out.println(girilenSayi + " sayısının rakamları toplamı: " + rakamToplami);
        */


        /* Ornek64 Ters Yıldız Üçgeni
        System.out.print("Kaç satırlık ters üçgen çizilsin?: ");
        int satirSayisi = input.nextInt();

        for (int satir = satirSayisi; satir >= 1; satir--) {
            for (int yildiz = 1; yildiz <= satir; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /* Ornek65 Armstrong Sayısı
        System.out.print("3 basamaklı bir sayı giriniz: ");
        int armstrongAdayi = input.nextInt();
        int temp = armstrongAdayi;
        int kupToplam = 0;

        while (temp > 0) {
            int basamak = temp % 10;
            kupToplam = kupToplam + (basamak * basamak * basamak);
            temp = temp / 10;
        }

        if (kupToplam == armstrongAdayi) {
            System.out.println(armstrongAdayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(armstrongAdayi + " Armstrong sayısı değildir.");
        }
        */


        /* Ornek66 "Sıfır" Görene Kadar Topla
        int genelToplam = 0;
        System.out.println("Sayıları girmeye başlayın (Çıkmak için 0 tuşlayın):");

        while (true) {
            System.out.print("Sayı: ");
            int eklenecekSayi = input.nextInt();

            if (eklenecekSayi == 0) {
                break;
            }
            genelToplam += eklenecekSayi;
        }

        System.out.println("Girilen sayıların genel toplamı: " + genelToplam);
        */


        /* Ornek67 FizzBuzz
        System.out.println("--- FizzBuzz Oyunu Başlıyor ---");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        */
    }
}