//import java.util.*;
public class commonprefix {
    public static String commonperfixes(String[] strs){
        if(strs == null || strs.length == 0){
            return "" ;
        }

        for(int col = 0 ; col<strs[0].length(); col++){
            char currentChar = strs[0].charAt(col);
            for(int row = 1; row< strs.length; row++){
                if(col >= strs[row].length() || strs[row].charAt(col) != currentChar){
                    return strs[0].substring(0,col);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        String[] word = {"flower" , "flew" , "flight"} ; // we cam take input if req.
        System.out.println(commonperfixes(word));

        
    }
   
}