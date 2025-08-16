/*
Unique Elements bookmark_borderPrint unique elements of the array in the same order as they appear in the input.

Note: 
 Do not use any inbuilt functions / libraries for your main logic.  Input Format
The first line of input contains the size of the array - N and the second line contains the elements of the array.

Output Format
Print unique elements from the given array.

Constraints
1 <= N <= 100
0 <= ar[i] <= 109

Example
Input
7
5 4 10 9 21 4 10

Output
5 9 21
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
       for(int i=0;i<arr.length;i++){
        boolean unq=true;
        for(int j=0;j<arr.length;j++){
          if(i!=j && arr[i]==arr[j]){
            unq=false;
            break;
          }
        }
        if(unq){
          System.out.print(arr[i]+" ");
        }
       }
    }
}
