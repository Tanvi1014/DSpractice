import java.util.*;

import javax.management.RuntimeErrorException;
class stackqueue {
    Queue<Integer> q = new LinkedList<>();
    public void push(int x){
        q.add(x);
        int size = q.size();
        for(int i = 0 ; i< size - 1 ; i++){
            q.add(q.remove());
        }

    }

    public int pop() {
        if(q.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return q.remove();
    }

    public int top(){
        if(q.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return q.peek();
    }
    public boolean empty() {
        return q.isEmpty();
    }
}
     // public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
       // System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        
    }

