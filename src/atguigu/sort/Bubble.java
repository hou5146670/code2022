package atguigu.sort;

import org.junit.jupiter.api. Test;


public class Bubble {
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - 1 - i ; j++){
               if (greater(a[j],a[j + 1])){
                   exchange(a,j,j + 1);
               }
            }
        }
    }
    private static  boolean greater(Comparable v,Comparable w){
            return v.compareTo(w) > 0;
    }
    private static void exchange(Comparable[]a,int i,int j){
            Comparable temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
    }
    @Test
    public void test(){
        Integer[] arr = new Integer[] {6,5,3,7,8,2};
        Bubble.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
        }

    }


}
