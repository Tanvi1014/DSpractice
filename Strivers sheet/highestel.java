import java.util.HashMap;

public class highestel {
    public static void main(String[] args) {
        int number[] = {1 , 1 , 6 , 7 , 9, 5 , 4 , 1 , 9};

        HashMap<Integer , Integer > map = new HashMap<>();
        for (int numbers : number){
            if(map.containsKey(number)){
                map.put(numbers, map.get(number) + 1);
            }else{
                map.put(numbers, 1);
            }
        }
        for(int i = 0; i < numbers  ; i++){
            if(i > i+ 1 ){
                System.out.println("highest element" + i);
            }else{
                System.out.println(i + 1 );
            }
        }
        }
    }
    

