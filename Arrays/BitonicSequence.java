/*
Is Bitonic Sequence bookmark_borderGiven an array of integers A, print true if and only if it is a valid array. A is a valid array if and only if there exists some i with 0 < i < A.length - 1 such that: A[0] < A[1] < ... < A[i - 1] < A[i] > A[i + 1] > ... > A[A.length - 1].

Note: A sequence, sorted in increasing order is considered Bitonic with the decreasing part as empty. Similarly, decreasing order sequence is considered Bitonic with the increasing part as empty.

Input Format
The first line of the input contains N. Second line of input contains an array of size N.

Output Format
Print true if and only if it is a valid array, otherwise print false.

Constraints
3 ≤ N ≤ 104
0 ≤ Ai ≤ 104

Example
Input
4
0 3 2 1

Output
true
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    boolean tf=true;
    int index=-1;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int i=0;
    while(i<n-1 && arr[i]<arr[i+1]){
        i++;
    }
    if(i==n-1){
        System.out.println(true);
        return;
    }
    while(i<n-1 && arr[i]>arr[i+1]){
        i++;
    }
     if(i==n-1){
        System.out.println(true);
     }
     else{
        System.out.println(false);
     }
    }
}
