import java.util.*;
public class kthshort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer numbers[] = new Integer[size];
        for(int i = 0; i< size ; i++){
            numbers[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(numbers);
        if(k > 0 && k<= size ){
            System.out.println("the kth short el is : " + numbers[k - 1]);
        }else{
            System.out.println("k is invalid");
        }
       
        sc.close();
    }
    
}
