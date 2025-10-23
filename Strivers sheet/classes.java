import java.util.*;
public class classes {

    static class studentinfo {
        String section;
        int rollno;
        String name;

        studentinfo(String section, int rollno, String name) {
            this.section = section;
            this.rollno = rollno;
            this.name = name;
        }
    }
    static void studentinfo2(studentinfo[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].section + " " + arr[i].rollno + " " + arr[i].name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        studentinfo[] arr = new studentinfo[size];
        for (int i = 0; i < size; i++) {
            String section = sc.next();
            int rollno = sc.nextInt();
            String name = sc.next();
            studentinfo info = new studentinfo(section, rollno, name);
            arr[i] = info;
        }
        System.out.println();
        studentinfo2(arr);
    }
}
}
