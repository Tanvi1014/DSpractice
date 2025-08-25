public class printnumb {
   
    }
    static void printnum1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);

        printnum1(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printnum1(n);
    }

