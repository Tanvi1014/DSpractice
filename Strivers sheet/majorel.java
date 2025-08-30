import java.util.*;
public class majorel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        for(int i = 0; i<numbers.length - 1 ; i++){
            if(numbers[i] == numbers[i+ 1]){
               // int rep = ;
                System.out.println(numbers[i]);
                 // Skip all occurrences of this duplicate (cheatcodee from chatgpt)
                while (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
                    i++;
            }
        }
        sc.close();


    }
    
}
}
