import java.util.*;
public class maxndmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        for(int i = 0; i< size ; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        List<Integer> list = Arrays.asList(numbers);
       System.out.println("minimum num : " + list.get(0)); 
        System.out.println("maximum num :" + list.get(3));
        sc.close();



    }
    
}
