import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = name.length();
        System.out.println(lenght);
        char letter = name.charAt(4);
        System.out.println(letter);
        int index = name.indexOf("a");
        System.out.println(index);
        int lastindex = name.lastIndexOf("a");
        System.out.println(lastindex);
        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
        name = name.replace("a", "yes");
        System.out.println(name);
        if(name.isEmpty()){
            System.out.println("the string is empty");
        }else{
            System.out.println();
        }


    }
    
}
