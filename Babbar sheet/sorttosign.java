import java.util.*;
public class sorttosign {
     static int[] move(int[] arr) {
        Arrays.sort(arr);
        return arr;
    } 
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] ans = move(arr);
        
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
