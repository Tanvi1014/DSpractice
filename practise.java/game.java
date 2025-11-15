import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        int number = sc.nextInt();

        System.out.println("Enter an ajdective (description) :");
        adjective1 = sc.nextLine();
        System.out.println("Enter a noun (animal or person):");
        noun1 = sc.nextLine();
        System.out.println("Enter an adjective (description) :");
        adjective2 = sc.nextLine();
        System.out.println("Enter a verb end with -ing(action):");
        verb1 = sc.nextLine();
        System.out.println("Enter an adjective (description):");
        adjective3 = sc.nextLine();

        System.out.println("today i went to a " + adjective1 + "zoo");
        System.out.println("in  a exhibit i saw a " + noun1 + ".");
        System.out.println(noun1 + "was" + adjective2 + "and" + verb1 + "!");
        System.out.println("i was " + adjective3 + "!");

        number = random.nextInt(); //it will give us any random number 
        //if in bracket we write an limit like (2 , 10) so it will give us the ouput in that range only 

        sc.close();

    }
}
