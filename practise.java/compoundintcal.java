import java.util.*;
public class compoundintcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle amount:");
        double principle = sc.nextDouble();
        System.out.println("eneter the interest rate:");
        double rate = sc.nextDouble();
        System.out.println("amount of times compuneded im the year");\
        int timescompound = sc.nextInt();
        System.out.println("amount of # in years");
        int years = sc.nextInt();
        double amount= sc.nextDouble();

        amount = principle * Math.pow(1 + rate / timescompound , timescompound * years);
        System.out.println(amount);


    }
}
