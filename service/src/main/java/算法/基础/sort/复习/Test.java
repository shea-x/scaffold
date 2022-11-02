package 算法.基础.sort.复习;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] a = {2,3,9,5,4,7,1,1,2,5,19,1,1,1,1,2,3,1,3,5,11,2,4,5};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
