/*
Leaders in an Array


0

100
Medium

Given an integer array nums, return a list of all the leaders in the array.



A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.


Examples:
Input: nums = [1, 2, 5, 3, 1, 2]

Output: [5, 3, 2]

Explanation: 2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]

Input: nums = [-3, 4, 5, 1, -4, -5]

Output: [5, 1, -4, -5]

Explanation: -5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]
*/
package Arrays.Day5;
import java.util.ArrayList;

public class Leaders {
    public static ArrayList<Integer> led(int[] arr){
        ArrayList<Integer>  ans=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                ans.add(max);
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = led(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
