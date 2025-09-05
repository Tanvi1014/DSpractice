import java.util.*;
public class LLrevingrp {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("the original list is -->" + list);
        Collections.reverse(list);
        System.out.println("the reversed list -->" + list);



    }
    
}
