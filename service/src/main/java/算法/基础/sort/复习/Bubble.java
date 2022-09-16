package 算法.基础.sort.复习;

public class Bubble {
    // ^异或， 相同为0，不同为1
    public static void sort(int[] a) {
        boolean flag = true;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    flag = false;
                    a[j] = a[j] ^ a[j + 1];
                    a[j + 1] = a[j] ^ a[j + 1];
                    a[j] = a[j] ^ a[j + 1];
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
