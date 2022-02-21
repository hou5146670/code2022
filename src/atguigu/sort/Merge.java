package atguigu.sort;

import org.junit.jupiter.api.Test;

public class Merge {
    private static Comparable[] assist;
    private static boolean less(Comparable v ,Comparable w){
        return  v.compareTo(w)<0;
    }
    public static void sort(Comparable[] a) {
        assist = new Comparable[a.length];
        int lo = 0;
        int hi = a.length - 1;
        sort(a,lo,hi);

    }
    public  static  void  sort(Comparable[] a,int lo,int hi){
        if(hi < lo){
            return;
        }
        int mid = lo + (hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid +1 ,hi);




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
        Merge.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
        }

    }
}
