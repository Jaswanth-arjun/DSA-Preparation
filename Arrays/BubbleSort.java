/*
Implement Bubble Sort bookmark_borderGiven an array of size N, implement Bubble Sort.

Input Format
The first line of input contains an integer N - the size of an array. The second line contains the elements of the array.

Output Format
For each iteration of Bubble Sort, print the array elements.

Constraints
1 <= N <= 20
1 <= A[i] <= 103

Example
Input
6
5 8 10 15 3 6

Output
5 8 10 3 6 15
5 8 3 6 10 15
5 3 6 8 10 15
3 5 6 8 10 15
3 5 6 8 10 15
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
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
                //j++;
                
            }
            //j++;
            }
       //System.out.println();
    
    for(int nums : arr){
        System.out.print(nums+" ");
    }
    System.out.println();
    }
    }
}
