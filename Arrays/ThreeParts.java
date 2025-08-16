/*
Three Parts bookmark_borderGiven an array of integers A, print true if we can partition the array into three non-empty subarrays with equal sums.

Input Format
The first line of the input contains an integer N. Second line of input contains an array of size N.

Output Format
Print true if we can partition the array, otherwise false.

Constraints
3 ≤ N ≤ 104
-104 ≤ Ai ≤ 104

Example
Input
10
3 3 6 5 -2 2 5 1 -9 4

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
    //int i=0;
    //int j=n-1;
    //boolean tf=false;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int ts=0;
    for(int num:arr){
        ts+=num;
    }
    if(ts%3!=0){
        System.out.println("false");
        return;
    }
    int ps=ts/3;
    int s=0,c=0;
    for(int i=0;i<n-1;i++){
        s+=arr[i];
        if(s==ps){
            c++;
            s=0;
        }
        if(c==2){
           System.out.println("true"); 
           return;
        }
    }
    System.out.println("false");
    }
}
