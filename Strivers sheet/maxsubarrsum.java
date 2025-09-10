public class maxsubarrsum {
    public static void main(String[] args) {
        int numbers[] = {1 , 2 , 3 , 4 ,5 ,6 ,7 };
        int n = numbers.length;
        int maxSum = Integer.MIN_VALUE;
        for(int st = 0; st< n ; st++){
            int currSum = 0;
            for(int end = st; end < n ; end++){
                currSum += numbers[end];
             maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println(maxSum);
        
    }
    
}
