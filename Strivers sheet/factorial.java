public class factorial {
    public static int calfactorial(int n){
        if(n == 1 || n== 0){
            return 1;
        }
        int factorialnm1 = calfactorial(n-1);
        int factorialn = n * factorialnm1;
        return factorialn;
    }


    public static void main(String[] args) {
        int n = 5;
       int ans = calfactorial(n);
       System.out.println(ans);
    }
    

    }

