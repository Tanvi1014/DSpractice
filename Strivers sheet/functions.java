import java.util.*;
public class functions {
   static class personinfo{
        String name;
        int age;
        
        personinfo(String name , int age){
            this.name = name ;
            this.age = age;
        }
    }
    static void personinfo2(personinfo arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i].name + " " + arr[i].age);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        personinfo arr[] = new personinfo[size];
        for(int i = 0 ; i<size ; i++){
            String name = sc.next();
            int age = sc.nextInt();
            personinfo info = new personinfo(name , age);
            arr[i] = info;
            
        }  
        System.out.println();
        personinfo2(arr);
    }
}

