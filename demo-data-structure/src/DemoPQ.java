import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new SortByIntegerDesc());
        pq.add(40);
        pq.add(20);
        pq.add(15);
        pq.add(150);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        // 15, 20, 40, 150
        // 150, 40, 20, 15 after putting method SortByIntegerDesc

        Queue<String> pq2 = new PriorityQueue<>(new SortByStringDesc());
        pq2.add("Apple");
        pq2.add("angel");
        pq2.add("Fun");
        pq2.add("donald");
        pq2.add("Cat");

        while(!pq2.isEmpty()) {
            System.out.println(pq2.poll());
        } // donald, angel, Fun, Cat, Apple

        PriorityQueue<Integer> pq3 = new PriorityQueue<>();

    }
}
