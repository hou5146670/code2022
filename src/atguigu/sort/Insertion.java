package atguigu.sort;

import org.junit.jupiter.api.Test;

public class Insertion {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {

            for (int j = i; j > 0; j--) {
                if (greater(a[j - 1], a[j])) {
                    exchange(a, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    @Test
    public void test() {
        Integer[] arr = new Integer[]{6, 5, 3, 7, 8, 2};
        Insertion.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
        }

    }
}