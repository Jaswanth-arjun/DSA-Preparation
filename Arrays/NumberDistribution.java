/*
Number Distribution bookmark_borderPrint the count of the occurrences of positive integers, negative integers, and zeroes in the given array.

Input Format
The first line of the input contains an integer N - size of the array, second line of input contains an array elements of the array.

Output Format
Print the frequencies of zeroes, positives elements and negative elements.

Constraints
1 <= N <= 104
-103 <= arr[i] <= 103

Example
Input
10
120 0 -9 89 68 -982 91 -54 -12 -139

Output
1 4 5
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int p=0;
	int n=0;
	int z=0;
	int[] arr=new int[N];
	for(int i=0;i<N;i++){
	    arr[i]=sc.nextInt();
	    if(arr[i]>0) p++;
	    else if(arr[i]<0)  n++;
	    else  z++;
	}
	
    System.out.print(z+" "+p+" "+n);
	}
}
