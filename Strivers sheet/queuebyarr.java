import java.util.*;
public class queuebyarr {
    static class Queue{
        ArrayList<Integer> pq = new ArrayList<>();

           // ArrayList<Integer> list = new ArrayList<>();

    public void push(int data) {
        pq.add(data);
    }

    public boolean isEmpty() {
        return pq.size() == 0;
    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int top = pq.remove(pq.size() -1);
        return top;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return pq.get(pq.size() -1);
    }
}
public static void main(String[] args) {
   
    Queue queue = new Queue();
     queue.push(1);
     queue.push(2);
     queue.push(3);
     queue.push(4);


    while(!queue.isEmpty()) {
        System.out.println(queue.peek());
        queue.pop();
    }
}
    
}

    
    
        
    

