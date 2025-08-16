/*
Mean Median Mode bookmark_borderGiven a sorted array A, containing N integers. Calculate and print their Mean, Median and Mode.

1. For both the Mean and Median, display the values with precision up to two decimal places.
2. Print the first Mode that you encounter from the left hand side.

Input Format
First line of input contains integer N - the size of the array. Second line of input contains N integers - elements of the array A.

Output Format
Print Mean, Median and Mode, separated by spaces.

Constraints
1 <= N <=104
0 <= A[i] <=100

Example
Input
8
1 2 3 4 5 5 6 6

Output
4.00 4.50 5
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
       // int Mean;
        int m=0;
        for(int i=0;i<arr.length;i++){
            m+=arr[i];
        }
       double Mean=(double)m/n;
       Arrays.sort(arr);
       double Median;
       if(n%2==0){
         Median=(arr[n/2-1]+arr[n/2])/2.0;
       // int Median=d/2;
       }else{
        Median=arr[n/2];
       }
       int Mode=arr[0];
       int c1=1;
       int c2=1;
       for(int i=1;i<arr.length;i++){
       if(arr[i]==arr[i-1]){
        c1++;
       }
       else{
        c1=1;
       }
        if(c1>c2){
            c2=c1;
            Mode=arr[i];
        }
       }
     //  int Mode=c1;
       System.out.printf("%.2f %.2f %d",Mean,Median,Mode);
    }
}
