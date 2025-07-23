/*
Given an array nums of n integers, return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.


Examples:
Input: nums = [100, 4, 200, 1, 3, 2]

Output: 4

Explanation: The longest sequence of consecutive elements in the array is [1, 2, 3, 4], which has a length of 4. This sequence can be formed regardless of the initial order of the elements in the array.

Input: nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]

Output: 9

Explanation: The longest sequence of consecutive elements in the array is [0, 1, 2, 3, 4, 5, 6, 7, 8], which has a length of 9. 
*/
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
