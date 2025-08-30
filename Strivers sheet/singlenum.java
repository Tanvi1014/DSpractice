import java.util.Arrays;

public class singlenum {
    public static void main(String[] args) {
        int arr[] ={1 , 2 , 3 , 2 , 1 };
        Arrays.sort(arr);
        for(int i = 0 ; i< arr.length - 1 ; i++){
            if(arr[i] != arr[i+1]){
                int notrep = i;
                System.out.println(notrep);
            }
        }
    }
    
}
