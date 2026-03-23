package problems.arrays;

public class AletIndexBulucu {
    public static void solve() {
        String[] aletler = {"Çekiç", "Tornavida", "Matkap", "Pense", "Testere"};

        for (int i = 0; i < aletler.length; i++) {
            if (aletler[i].equals("Matkap")) {
                System.out.println("Matkap bulundu! Alet çantasının " + i + ". indeksindedir.");
                break;
            }
        }
    }
}