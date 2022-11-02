package 算法.基础.sort;

public class Shell {


    public static void sort(Comparable[] a) {

        int N = a.length;

        int h = 1;

        while (h < N / 2) {
            h = h * 2 + 1;
        }

        while (h >= 1) {

            for (int i = h; i < N; i++) {

            }


        }


    }


    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


}
