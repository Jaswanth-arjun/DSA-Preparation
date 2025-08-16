/*
Max Altitude bookmark_borderImagine a pilot starting the flight from the ground and flying over a series of different points at different heights. You are given an array, where A[i] represents heights.
Currently, if the pilot is at altitude X at ith point, and if he wants to reach (i+1)th point, his altitude will become X+A[i].
The pilot starts at altitude 0 and wants to find the highest point he can reach during the entire journey. Your task is to print the highest altitude the pilot reaches.

Input Format
The first line of input contains an integer N. The second line of input contains N space-separated integers.

Output Format
Print the highest altitude the pilot can reach.

Constraints
1 <= N <= 1000
-1000 <= A[i] <= 1000

Example
Input
5
-5 1 5 0 -7

Output
1
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
    int max=0;
    for(int i=0;i<arr.length;i++){
         s+=arr[i];
       max=Math.max(s,max);
       //i++;
    }
    System.out.print(max);
    }
}
