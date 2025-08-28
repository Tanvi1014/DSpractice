public class orderagnosticBS {
    public static void main(String[] args) {
        
    }
    static int orderAgnosticBS(int arr[] , int target){
        int s = 0; 
        int end = arr.length - 1;

        //find whether the arr is asc or desc
        boolean isAsc;
        if(arr[start] <arr[end ]){
            isAsc = true;
        }else {
            isAsc = false;
        }
        while(start <= end ){
            int mid = start + (end- start) / 2;
            if(arr[mid] == target ){
                return mid;
            }if (isAsc){
                if(target <arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }else{
                if(target >arr[mid]){
                end = mid - 1;
            }else  (target < arr[mid]) {
                start = mid + 1;
            }
            }
            }

            
            
        

        return -1;
    }
    
    }
}
