import java.util.*;
public class peakel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        for(int i = 0; i<numbers.length - 1; i++){
            if( numbers[i - 1] < numbers[i] && numbers[i + 1] < numbers[i]){
             System.out.println(i);
            }
        }
        sc.close();
    }
    
}
