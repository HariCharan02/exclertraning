import java.util.HashSet;

class HashSetDemo1 {
    void HSetMethod() {
        // We can add any type of element here...
        HashSet hashSet = new HashSet();
        hashSet.add(101);
        hashSet.add("Charan");
        hashSet.add(9999.9);
        System.out.println(hashSet);

        // we can use Object class to read any type of elements
        for (Object x : hashSet) {
            System.out.println(x);
        }
    }
}

public class Demo031 {
    public static void main(String[] args) {
        HashSetDemo1 obj = new HashSetDemo1();
        obj.HSetMethod();
    }
}