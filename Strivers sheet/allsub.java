//import java.util.*;
public class allsub {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // int size = sc.nextInt();
        int numbers[] = {1, 2 , 3 , 4 , 5};
        int n = numbers.length;
        for(int st = 0 ; st < n; st++){
            for(int end = st; end <n ; end++){
                for(int i = st ; i<= end ; i++){
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
                
        }
    }

    }
    
}
