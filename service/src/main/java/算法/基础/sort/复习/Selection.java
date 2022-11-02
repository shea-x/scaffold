package 算法.基础.sort.复习;

public class Selection {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                minIndex = a[minIndex] <= a[j] ? minIndex : j;
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }


}
