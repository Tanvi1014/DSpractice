import java.util.Scanner;

class marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter an integer: ");
        int marks = input.nextInt();
        if(marks >= 90){
            System.out.println("Grade A");
        }else if (marks >= 70){
            System.out.println("Grade B");
        }else if (marks >= 50){
            System.out.println("Grade C");
        }else if(marks >= 35) {
            System.out.println(" Grade d");
        }else {
            System.out.println("Fail");
        }
    input.close();
    }
}
    

