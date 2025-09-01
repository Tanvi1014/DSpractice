import java.util.*;

class mergeinterval {
    static ArrayList<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0])); //sorting array

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{arr[0][0], arr[0][1]});

        for (int i = 1; i < arr.length; i++) {
            int[] last = list.get(list.size() - 1);
            int[] curr = arr[i];

            // If current interval overlaps with the last merged interval,
            // merge them
            if (curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
             } else{
                list.add(new int[]{curr[0], curr[1]});
        }
    }

        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        ArrayList<int[]> list = mergeOverlap(arr);

        for (int[] interval : list)
            System.out.println(interval[0] + " " + interval[1]);
    }
}
