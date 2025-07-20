/*Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.



A subarray is a contiguous non-empty sequence of elements within an array.


Examples:
Input: nums = [2, 3, 5, -2, 7, -4]

Output: 15

Explanation: The subarray from index 0 to index 4 has the largest sum = 15

Input: nums = [-2, -3, -7, -2, -10, -4]

Output: -2

Explanation: The element on index 0 or index 3 make up the largest sum when taken as a subarrayGiven an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.



A subarray is a contiguous non-empty sequence of elements within an array.


Examples:
Input: nums = [2, 3, 5, -2, 7, -4]

Output: 15

Explanation: The subarray from index 0 to index 4 has the largest sum = 15

Input: nums = [-2, -3, -7, -2, -10, -4]

Output: -2

Explanation: The element on index 0 or index 3 make up the largest sum when taken as a subarray*/


public class Max {
    public static int maxSum(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(arr)); // Output: 6
    }
}
