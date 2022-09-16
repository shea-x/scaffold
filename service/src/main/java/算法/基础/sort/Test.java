package 算法.基础.sort;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
  /*      Student stu1 = new Student();
        stu1.setUsername("zhangsan");
        stu1.setAge(17);

        Student stu2 = new Student();
        stu2.setUsername("lisi");
        stu2.setAge(19);

        Comparable max = getMax(stu1, stu2);
        System.out.println(max);
*/

/*       // Integer[] a = {4,5,6,3,2,1};
        Integer[] a = {1,3,4,5,6,2};
        Bubble.sort(a);
        System.out.println(Arrays.toString(a));*/

/*         Integer[] a = {4,5,6,3,2,1};
        //Integer[] a = {1,3,4,5,6,2};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));*/

         Integer[] a = {4,5,6,3,2,1};
        //Integer[] a = {1,3,4,5,6,2};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));



    }

    private static Comparable getMax(Comparable c1, Comparable c2) {
        int cmp = c1.compareTo(c2);
        if (cmp > 0) {
            return c1;
        } else {
            return c2;
        }

    }

}