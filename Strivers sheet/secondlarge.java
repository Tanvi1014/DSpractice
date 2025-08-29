import java.util.*;
public class secondlarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {3 , 5 , 6 ,9 , 2, 8};

        Arrays.sort(numbers);
        int secondlargest = numbers[numbers.length - 2];
        System.out.println("second largest " + " " + secondlargest);
    }
}
