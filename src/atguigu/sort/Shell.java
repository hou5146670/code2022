package atguigu.sort;

import org.junit.jupiter.api.Test;

public class Shell {
    public static void sort(Comparable[] a) {
        int h = 1;
        while(h < a.length/2){
            h = 2*h + 1;
        }
        while (h>=1){
            //排序
            for (int i = h; i < a.length; i++)
            {
                for (int j = i;j >= h; j-=h)
if (greater(a[j-h],a[j])){
    exchange(a,j-h,j);
}
            }
                //减少h的值
                h = h/2;
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
        Shell.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
        }

    }
}

