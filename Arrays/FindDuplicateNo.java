/*
Find Duplicate Number in Array bookmark_borderFind a duplicate element in the given array of integers. There will be only a single duplicate element in the array.

Note: 
 Do not use any inbuilt functions / libraries for your main logic  Input Format
The first line of input contains the size of the array - N and the second line contains the elements of the array, there will be only a single duplicate element in the array.

Output Format
Print the duplicate element from the given array.

Constraints
2 <= N <= 100
0 <= ar[i] <= 109

Example
Input
6
5 4 10 9 21 10

Output
10
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int d=arr[0];
        boolean pr=true;
        for(int i=1;i<arr.length;i++){
            if(d==arr[i]){
                if(pr){
                System.out.print(arr[i]);
                pr=false;
                }
            }
            else{
                d=arr[i];
                pr=true;
            }
        }
    }
}
