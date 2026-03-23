package problems.arrays;

public class AylikUretimBirlestirici {
    public static void solve() {
        int[] ay1 = {10, 20, 30, 40};
        int[] ay2 = {5, 15, 25, 35};
        int[] toplamUretim = new int[ay1.length];

        for (int i = 0; i < ay1.length; i++) {
            toplamUretim[i] = ay1[i] + ay2[i];
            System.out.println(i + ". İndeks Toplam Üretimi: " + toplamUretim[i]);
        }
    }
}