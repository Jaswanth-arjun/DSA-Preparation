/*
Ternary Array bookmark_borderGiven an array A of size N, find the minimum cost to convert it to a ternary array B. A ternary array can only have 0 or 1 or 2. After conversion, ensure that A[i] != B[i]. The cost of converting A[i] to B[i] is | A[i] - B[i] |.

Input Format
The first line of input contains a single integer N - the size of the array and the second line contains array elements.

Output Format
Print the minimum cost to convert array A to B.

Constraints
1 <= N <= 10000
-100000 <= A[i] <= 100000

Example
Input
5
1 -1 2 0 5

Output
7
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] arrr=new int[n];
    int s=0;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            arrr[i]=0;
        }
        else if(arr[i]==0){
            arrr[i]=1;
        }
        else{
            arrr[i]=2;
        }
        if(arr[i]==arrr[i]){
            int mincost=Integer.MAX_VALUE;
            int best=arrr[i];
            for(int k=0;k<=2;k++){
                if(k!=arr[i]){
                    int cost=Math.abs(arr[i]-k);
                    if(cost<mincost){
                        mincost=cost;
                        best=k;
                    }
                }
            }
            arrr[i]=best;
        }
    }
    for(int i=0;i<n;i++){
        if(arr[i]!=arrr[i]){
         s+=Math.abs(arr[i]-arrr[i]);
        //s+=m;
    }}
    System.out.print(s);
    }
}
