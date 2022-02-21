package atguigu.sort;

import org.junit.jupiter.api.Test;

public class Selection {
    public static void sort(Comparable[] a){
        for (int i = 0 ; i < a.length - 1; i++){
             int minIndex = i;
             for (int j = i + 1; j < a.length ; j++){
                 if(greater(a[minIndex],a[j])){
                     minIndex = j;
                 }
             }
             exchange(a,minIndex,i);
        }

    }
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w) > 0;
    }
    private static void exchange(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
    @Test
    public void test(){
        Integer[] arr = new Integer[] {6,5,3,7,8,2};
        Selection.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
        }

    }
}
