package atguigu.queue;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class SequenceList<T>  implements Iterable<T> {
    private  T[] eles;
    private  int N;
    public SequenceList(int capacity){
        this.eles =(T[])new Object[capacity];
        this.N =0;
    }
    public void clear(){
        N = 0;
    }
    public boolean isEmpty(){
       return N == 0;
    }
    public int length(){
        return  N;
    }
    public T get(int i){
       return eles[i];
    }
    public void insert(T t){
        eles[N++] = t;
    }
    public void insert(int i,T t){
         for (int index = N;index>i;index--){
             eles[index]=eles[index-1];
         }
         eles[i] = t;
         N++;
    }
    public T remove( int i){
        T t =eles[i];
        for (int index= i;index<N-1;index++){
            eles[index]=eles[index+1];
        }
        N--;
        return t;

    }
    public int indexof(T t){
        for (int i =0;i<N;i++){
           if (eles[i].equals(t)){
               return i;
           }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{

        private int cusor;
        public SIterator(){
            this.cusor=0;
        }
        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
