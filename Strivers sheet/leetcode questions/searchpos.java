import java.util.*;

public class searchpos {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Integer numbers[] = new Integer[size];
    int i = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
   list.add(1);
   list.add(2);
   list.add(3);
   list.add(4);
   list.add(5);

    
    System.out.println("the position of the number" + " " + list.get(i) +" " +  "is " + i);
    sc.close();

}
}