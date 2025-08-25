import java.util.*;

public class selectionsort{ 

    
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int arr[] = new int[5] ;

        // Selection Sort
        for(int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // Swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        printArray(arr);
    }
}


