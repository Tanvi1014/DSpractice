import java.util.*;
public class numofrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        Arrays.sort(numbers);
        List<Integer> list = Arrays.asList(numbers);
        Collections.rotate(list, size);
        for(int i = 0 ; i< list.size() ; i ++){
            if(numbers[i] == 1){
                System.out.println(i);
            }
        }
        sc.close();

    }
    
}
