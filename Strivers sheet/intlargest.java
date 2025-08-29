import java.util.*;
public class intlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {2 , 4 , 7 ,9, 6, 3};

        Arrays.sort(numbers);
        int lastindex = numbers[numbers.length - 1];
       
            System.out.println("largest el" +" " + lastindex );
        



    }
    
}
