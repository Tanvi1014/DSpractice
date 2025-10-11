import java.util.*;

public class heaps {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> heap = new PriorityQueue<>(); // Min Heap by default

        heap.add(34);
        heap.add(45);
        heap.add(54);
        heap.add(89);
        heap.add(76);

        // Heap sort using PriorityQueue
        ArrayList<Integer> list = new ArrayList<>();
        while (!heap.isEmpty()) {
            list.add(heap.poll()); // removes the smallest element
        }

        System.out.println(list); // sorted ascending order
    }
}

