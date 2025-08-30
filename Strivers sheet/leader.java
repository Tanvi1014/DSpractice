import java.util.*;


public class leader {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];
    for(int i = 0; i < numbers.length -1 ; i++)   {
        int lastidx = numbers.length -1 ;
        System.out.println(lastidx);
        if(numbers[i] > numbers[i+1]){
            for(int n = 0; n< numbers[i] - 1; n++)
            System.out.println(numbers[n]);

        }
    } 
    sc.close();
    }
    
}
