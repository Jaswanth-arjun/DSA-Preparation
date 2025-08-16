/*
Max Element in Array bookmark_borderFind the maximum element from the given array of integers.

Input Format
﻿The first line of input contains N - the size of the array and the second line contains the elements of the array.

Output Format
Print the maximum element of the given array.

Constraints
1 <= N <= 103
-109 <= ar[i] <= 109

Example
Input
5
-2 -19 8 15 4

Output
15

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int m=arr[0];
		for(int i=1;i<n;i++){
		    m=Math.max(m,arr[i]);
		}
		System.out.print(m);
	}
}
