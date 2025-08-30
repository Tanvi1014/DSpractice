import java.util.*;

public class minel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] numbers = new Integer[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        List<Integer> list = Arrays.asList(numbers);
        Collections.rotate(list, 3);
        int largest = Collections.max(list);
        System.out.println("Largest element: " + largest);

        sc.close();
    }
}

    

