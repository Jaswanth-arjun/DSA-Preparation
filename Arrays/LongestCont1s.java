/*
Longest Contiguous 1's bookmark_borderGiven an array of elements containing 0's and 1's. You have to find the length of longest contiguous 1's.

Input Format
First line of input contains N - size of the array. The next line contains the N integers of array A.

Output Format
Print the length of longest contiguous 1's.

Constraints
1 <= N <= 1000

Example
Input
10
1 0 0 1 0 1 1 1 1 0

Output
4
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        int max=0;
        int i=0;
        while(i<n){
            if(arr[i]==1){
                c++;
            }
            else{
                 if(c>max){
                max=c;
                 }
               c=0;  
            }
            
             i++;
            }
           
            if(c>max){
                max=c;
            }
        
        System.out.print(max);
    }
}
