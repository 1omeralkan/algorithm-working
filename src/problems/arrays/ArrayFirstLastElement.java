package problems.arrays;

public class ArrayFirstLastElement {
    static String [] kelimeler={"Ali","Veli","Ayse","Fatma"};

    public static void solve() {
        System.out.println("İlk eleman: " + kelimeler[0]);
        System.out.println("Son eleman: " + kelimeler[kelimeler.length - 1]);
    }
}
