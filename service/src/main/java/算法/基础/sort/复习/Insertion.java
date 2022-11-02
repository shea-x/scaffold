package 算法.基础.sort.复习;

public class Insertion {


    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    i--;
                }
            }
        }


    }


}
