import java.util.*;
public class insertionsort {
    public static void insertionsort(int arr[]){

        
        for (int i = 0; i< arr.length ; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0  && current < arr[j]){
                arr[j+ 1 ] = arr[j];
                j--;
            }
            arr[j+1 ]= current ;
            

        }
    }
        public static void main(String args[]){
            int arr[] = { 67, 54 , 48 , 98, 69};
            insertionsort(arr);
            System.out.println(Arrays.toString(arr));
        
       }
    
}
