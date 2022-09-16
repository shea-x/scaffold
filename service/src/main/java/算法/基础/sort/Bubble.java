package 算法.基础.sort;

/**
 * 冒泡排序
 */
public class Bubble {

    public static void sort(Comparable[] a) {

        // Integer[] a = {4,5,6,3,2,1};
        /**
         * 6个数总共需要比较 5轮结束
         * ==初始==     4，5，6，3，2，1
         *
         * ==第一轮==   4，5，3，2，1，[6]
         * ==第二轮==   4，3，2，1，[5]，[6]
         * ==第三轮==   3，2，1，[4]，[5]，[6]
         * ==第四轮==   2，1，[3]，[4]，[5]，[6]
         * ==第五轮==   1，[2]，[3]，[4]，[5]，[6]
         *
         * 每轮需要比较次数递减
         * ==第一轮== 5
         * ==第二轮== 4
         * ==第三轮== 3
         * ==第四轮== 2
         * ==第五轮== 1
         *
         */
        // 做一个标记，如果一轮比较过程中没有发生交换，说明数组已经有序了，直接break
        boolean flag = true;
        // 总共5轮
        for (int i = a.length - 1; i > 0; i--) {
            // 每一轮交换次数,递减，5，4，3，2，1
            for (int j = 0; j < i; j++) {
                // 需要比较的两个数
                if (greater(a[j], a[j + 1])) {
                    flag = false;
                    exec(a, j, j + 1);
                }
            }
            if (flag) {
                break;
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
