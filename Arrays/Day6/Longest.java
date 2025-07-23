package Arrays.Day6;
import java.util.HashSet;
import java.util.Set;

public class Longest {
    public static int longestConsecutive(int[] arr){
        int n = arr.length;
        int l = 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        for(int x : set){
            if(!set.contains(x - 1)){
                int c = 1;
                int y = x;
                while(set.contains(y + 1)){
                    c++;
                    y++;
                }
                l = Math.max(l, c);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // Output: 4
    }
}