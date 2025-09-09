import java.util.*;
public class numappearoddtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int size = sc.nextInt();
        Integer numbers[] = new Integer[5];
       List<Integer> list = Arrays.asList(numbers);
       Collections.sort(list);

        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[numbers[i]] != numbers[numbers[i+1]] || numbers[numbers[i]] != numbers[numbers[i+1]]){
                System.out.println("this num appears once" + i);
            }
        }
        sc.close();
    }
    
}
