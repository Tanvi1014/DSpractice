import java.util.*;
public class numdisappeared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int j = numbers[size];
        for(int i = 0 ; i< numbers.length ; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        for(j = 0; j<numbers.length ; j++){
            if(numbers[numbers[j + 2]] == numbers[numbers[j]]){
                System.out.println("the number disappeared is :" + " " + numbers[j + 1]);
            }
        }
        sc.close();

    }
    
}
