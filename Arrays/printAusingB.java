/*
Print Array A Using B bookmark_borderGiven two arrays, A and B, for each index 'i' in array B, print the corresponding element from array A if B[i] is within the range of A, otherwise print -1.

Input Format
The first line of input contains an integer N - size of array A. The Second line of input contains elements of array A. The Third line of input contains an integer M - size of array B. The Fourth line of input contains elements of array B.

Output Format
Print the values of array A for every index 'i' in B i.e. A[B[i]] if B[i] is in the range, otherwise print -1.

Constraints
1 <= N <= 100
1 <= A[k] <= 1000
1 <= M <= 100
0 <= B[i] <= 1000

Example
Input
5
100 200 400 800 1000
6
4 2 0 6 10 0

Output
1000 400 100 -1 -1 100
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arrr=new int[m];
        for(int i=0;i<m;i++){
            arrr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(arrr[j]<arr.length){
                System.out.print(arr[arrr[j]]+" ");
                }
                else{
                    System.out.print(-1+" ");
                }
            }
             break;
        }
       
    }
}
