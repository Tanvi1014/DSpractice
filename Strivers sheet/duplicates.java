import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
       // int i = numbers[numbers.length -1];

        Arrays.sort(numbers);

        HashMap<Integer , Integer > map = new HashMap<>();
        for (int number : numbers){
            if(map.containsKey(number)){
                map.put(number, map.get(number) + 1);
            }else{
                map.put(number, 1);

               for(int i = 0; i<numbers.length ; i++){
                if (i > 1){
                    System.out.println(numbers[numbers.length]);
                }

               }



              sc.close();
            }
        }

        

        
        
    }
    
}
