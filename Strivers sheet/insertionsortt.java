import java.util.*;
public class insertionsortt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {  //arr input
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i< arr.length ; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                j--;
            }
            arr[j+ 1] = current;

        }
        System.out.println(arr);
    }
}
