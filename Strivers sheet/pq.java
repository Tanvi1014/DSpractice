import java.util.*;
public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(45);
        heap.add(56);
        heap.add(78);
        heap.add(90);
        heap.add(21);

        ArrayList<Integer> list = new ArrayList<>();
        while(!heap.isEmpty()) {
            heap.add(heap.poll());
        }
        System.out.println(list);
    }
}
