/*
Implement Insertion Sort bookmark_borderGiven an array of size N, implement Insertion Sort.

Input Format
The first line of input contains an integer N - the size of an array. The second line contains the elements of the array.

Output Format
For each iteration of Insertion Sort, print the array elements.

Constraints
1 <= N <= 20
1 <= A[i] <= 103

Example
Input
5
8 7 1 2 4

Output
7 8 1 2 4
1 7 8 2 4
1 2 7 8 4
1 2 4 7 8
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
    for(int i=1;i<n;i++){
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int t=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=t;

            j--;
        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        System.out.println();
    }

    }
}
