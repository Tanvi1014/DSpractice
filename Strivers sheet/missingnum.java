public class missingnum {
    public static void main(String[] args) {
        int numbers[] = {1 , 2 ,3 , 5 , 6};
        for(int i = 0; i<numbers.length - 1 ; i++){
            if(numbers[i+ 1] != numbers[i] + 1){
                System.out.println(numbers[i]+1);
            }
        }
    }
    
}
