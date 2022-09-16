package 算法.基础.sort;

/**
 * 选择排序
 */
public class Selection {

    /**
     * 6个数总共需要比较 5轮结束
     * ==初始==     4，5，6，3，2，1
     * ==第一轮==   1，5，6，3，2，4
     * ==第二轮==   1，2，6，3，5，4
     * ==第三轮==   1，2，3，6，5，4
     * ==第四轮==   1，2，3，4，5，6
     * ==第五轮==   1，2，3，4，5，6
     *
     * @param a
     */
    public static void sort(Comparable[] a) {

        // 总共有5轮
        for (int i = 0; i < a.length - 1; i++) {

            // 记录最小位置，最开始把第一个当成最小值，依次和后面每个数进行比较
            int minIndex = i;
            // 每轮比较的次数
            for (int j = i + 1; j < a.length; j++) {
                if (greater(a[minIndex], a[j])) {
                    // 更换最小值所在的索引
                    minIndex = j;
                }
            }
            // 交换i索引处和minIndex索引处的值
            exec(a, i, minIndex);
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
