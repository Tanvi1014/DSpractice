import java.util.*;

public class majorel {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Integer numbers[] = new Integer[size];
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
   list.add(1);
   list.add(2);
   list.add(3);
   list.add(2);
   list.add(1);
   list.add(2);
   System.out.println(list);
   Collections.sort(list);
   for(int i = 0; i<list.size() ; i++){
    if(numbers[numbers[i]] == numbers[numbers[numbers[i+1]]] || numbers[numbers[i]] == numbers[numbers[numbers[i -1]]] ){
      System.out.println("the major el is :" + i);
    }
    
   }
   sc.close();


}
}
