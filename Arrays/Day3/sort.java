/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */

package Arrays.Day3;

public class sort {
    public static int[] nums(int[] arr){
        int l=0,m=0,h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                int t=arr[l];
                arr[l]=arr[m];
                arr[m]=t;
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            
            }
            else
            {
                int t=arr[m];
                arr[m]=arr[h];
                arr[h]=t;
            h--;
                    }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr= {0, 1, 2, 0, 1, 2, 0, 1, 2};
        nums(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " "); 
        }
    }
    
}
