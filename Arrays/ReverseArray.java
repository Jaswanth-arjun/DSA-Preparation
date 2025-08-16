/*
Reverse Array bookmark_borderPrint the array in reverse order.

Note: 
 Try solving this using recursion. Do not use any inbuilt functions / libraries for your main logic.  Input Format
The first line of input contains N - the size of the array and the second line contains the elements of the array.

Output Format
Print the given array in reverse order.

Constraints
1 <= N <= 100
0 <= ar[i] <= 1000

Example
Input
5
2 19 8 15 4

Output
4 15 8 19 2
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
        int s=0;
        int N=n-1;
        while(s<N){
            int t=arr[s];
            arr[s]=arr[N];
            arr[N]=t;
             s++;
            N--;
        }
       
    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    
}
