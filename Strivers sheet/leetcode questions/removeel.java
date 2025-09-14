import java.util.*;

public class removeel {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int size = sc.nextInt();
    //Integer numbers[] = new Integer[size];
   // ArraysList<Integer> list = Arrays.asList(numbers);
     ArrayList<Integer> list = new ArrayList<>(); 
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
     int i = sc.nextInt();
     list.get(i);
    int j = list.remove(i);
    System.out.println(list);
    sc.close();

    

    


}

}