import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayLinkedList {   
    public static void main(String[] args) {

        // ArrayList add 10,000,000
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add("test");
        }

        long start = System.nanoTime();
        System.out.println(start); // 1700293074812

        long end = System.nanoTime();
        System.out.println("Execution time=" + (end - start)); // 1310125

        // LinkedList add 10,000,000
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            linkedList.add("test");
        }

        start = System.nanoTime();
        System.out.println(start);

        end = System.nanoTime();
        System.out.println("Execution time=" + (end - start));

    }
}
