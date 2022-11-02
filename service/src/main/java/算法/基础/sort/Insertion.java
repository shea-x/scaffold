package 算法.基础.sort;

public class Insertion {

    public static void sort(Comparable[] a) {

        // Integer[] a = {4,5,6,3,2,1};
        /**
         * 6个数总共需要比较 5轮结束
         * ==初始==     4，5，6，3，2，1
         *
         * ==第一轮==   4，5，6，3，2，1
         * ==第二轮==   4，5，6，3，2，1
         * ==第三轮==   3，4，5，6，2，1
         * ==第四轮==   2，3，4，5，6，1
         * ==第五轮==   1，2，3，4，5，6
         *
         * 每轮需要比较次数递减
         * ==第一轮== 5
         * ==第二轮== 4
         * ==第三轮== 3
         * ==第四轮== 2
         * ==第五轮== 1
         *
         */

        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (greater(a[j], a[i])) {
                    exec(a, i, j);
                    i--;
                }
            }
        }
    }



    /**
     * 比较v元素是否大于w元素
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 数组元素i和j交换位置
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exec(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
