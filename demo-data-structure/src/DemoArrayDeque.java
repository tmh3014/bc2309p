import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DemoArrayDeque {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        // add 1,000,000 strings into queue
        for (int i = 0; i < 1000000; i++) {
            queue.add("test");
        }
        // poll()

        Deque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < 1000000; i++) {

        }
    }

}