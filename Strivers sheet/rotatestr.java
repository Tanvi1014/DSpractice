public class rotatestr {
    public static String rotatingstr(String s , int n , boolean left){
        if(s == null || s.isEmpty()){
            return s;
        }
        int len = s.length();
        n = n % len;
        if(n == 0){
            return s;
        }
          if(left ){
             return s.substring(n) + s.substring(0 , n);
          }
          else{
            return s.substring(len-n) + s.substring(0, len- n);
          }
        }
          public static void main(String[] args){
            String str = "abcdef";
            System.out.println(rotatingstr(str, 2, false));
            System.out.println(rotatingstr(str, 3, true));

          }



    }
    

