public class minbrackets {
    public static int countReversals(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return -1;
        }
        int open = 0, close = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                     close++;
                }
            }
        }
        int reversals = (open / 2) + (close / 2);
        return reversals;
    }

    public static void main(String[] args) {
        String s1 = "())(";
        String s2 = "((()))))(((";
        String s3 = "((((";

        System.out.println(s1 + " → " + countReversals(s1)); 
        System.out.println(s2 + " → " + countReversals(s2)); 
        System.out.println(s3 + " → " + countReversals(s3)); 
    }
}
