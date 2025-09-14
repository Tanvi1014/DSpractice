import java.util.*;

public class mergearr {
    static ArrayList<int[]> mergearr(int[][] arr){
        Arrays.sort(arr , (a, b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{ arr[0][0] , arr[0][1]});
        for(int i = 0; i<arr.length ; i++){
            int[] curr = arr[i];
            int[] last = list.get(list.size() -1);
                        if (curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
             } else{
                list.add(new int[]{curr[0], curr[1]});
        }

        }
        return list;
        
    }


}
