//import java.util.*;
public class revstr {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        String s = "my name is tanvi";
        String reversed = reverseWords(s);
        System.out.println(reversed);


    }
        public static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String[] words = s.split("\\s+"); //divided the senetence into two parts
         int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    
}
}
  
