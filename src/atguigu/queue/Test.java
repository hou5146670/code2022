package atguigu.queue;

public class Test {
    public static void main(String[] args) {
            SequenceList<String> s1 = new SequenceList<>(10);
            s1.insert("hwm");
            s1.insert("hwm1");
            s1.insert("hwm2");
            s1.insert("hwm3");
            s1.insert("hwm4");
            s1.insert("hwm5");

            s1.insert(3,"3333");
            s1.remove(5);

            for (String s : s1) {
                    System.out.println(s);
            }
    }
}
