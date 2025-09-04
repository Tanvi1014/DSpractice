import java.util.*;
public class LLlooplen {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("the reversed list is -->" + list );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i< list.size(); i++){
            if(n == list.size() - 1){
              System.out.println(n);
            }
            System.out.println();
        }
        sc.close();

    }
    
}
