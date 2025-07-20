/*Given an array arr of n integers, where arr[i] represents price of the stock on the ith day. Determine the maximum profit achievable by buying and selling the stock at most once. 



The stock should be purchased before selling it, and both actions cannot occur on the same day.


Examples:
Input: arr = [10, 7, 5, 8, 11, 9]

Output: 6

Explanation: Buy on day 3 (price = 5) and sell on day 5 (price = 11), profit = 11 - 5 = 6.

Input: arr = [5, 4, 3, 2, 1]

Output: 0

Explanation: In this case, no transactions are made. Therefore, the maximum profit remains 0.
*/


package Arrays.Day4;

public class Stock {
    public static int max(int[] arr){
        int m=arr[0];
        int p=0;
        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-m;
            p=Math.max(p,cost);
            m=Math.min(m,arr[i]);
        }
        return p;   
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(max(arr)); // Output: 5
    }
}
