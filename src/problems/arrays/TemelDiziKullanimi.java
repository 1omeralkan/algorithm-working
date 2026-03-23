package problems.arrays;

public class TemelDiziKullanimi {
    public static void solve() {
        int[] notlar = new int[5];
        notlar[0] = 50;
        notlar[1] = 60;
        notlar[2] = 75;
        notlar[3] = 85;
        notlar[4] = 100;
        for (int i = 0; i < notlar.length; i++) {
            System.out.println(i + ". not: " + notlar[i]);
        }
    }
}