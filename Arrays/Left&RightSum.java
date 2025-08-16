/*
Left Sum and Right Sum bookmark_borderGiven an array A of size N. Construct an array B, such that B[i] is calculated as follows:
Find leftSum => sum of elements to the left of index i in array A; if none, use 0.Find rightSum => sum of elements to the right of index i in array A; if none, use 0.B[i] = | leftSum - rightSum |Your task is to simply print the B array.

Input Format
The first line of input contains the N - size of the array. The next line contains N integers - the elements of array A.

Output Format
Print the elements of the B array separated by space.

Constraints
1 <= N <= 103
0 <= arr[i] <= 100000

Example
Input
3
6 7 7

Output
14 1 13

*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     int[] leftsum=new int[n];
     int[] rightsum=new int[n];
    // ArrayList<Integer> list=new ArrayList<>();
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
    for(int i=1;i<n;i++){
        leftsum[i]=leftsum[i-1]+arr[i-1];
    }
    for(int i=n-2;i>=0;i--){
        rightsum[i]=rightsum[i+1]+arr[i+1];
    }
    int[] ans=new int[n];
    for(int i=0;i<n;i++){
        ans[i]=Math.abs(leftsum[i]-rightsum[i]);
    }
    for(int nums:ans){
        System.out.print(nums+" ");
    }
    }
}
