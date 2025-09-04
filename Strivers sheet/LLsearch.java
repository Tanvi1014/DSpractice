import java.util.*;

public class LLsearch {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.get(2);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(list.get(n) == null){
            System.out.println("element doesnt exist");
        }else{
            System.out.println(list.get(n));
        }
    
    
        sc.close();
            
        }
    }
    

