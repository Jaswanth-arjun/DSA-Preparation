/*
Alternate Seating bookmark_borderYou are given an integer N, denoting the number of people who need to be seated, and a list of M seats, where 0 represents a vacant seat and 1 represents an already occupied seat. Find whether all N people can find a seat, provided that no two people can sit next to each other.

Input Format
The first line of the input contains N denoting the number of people. The second line of input contains M denoting the number of seats. The third line of input contains the seats.

Output Format
If all N people can find seats, print YES otherwise NO.

Constraints
1 ≤ N ≤ 105
1 ≤ M ≤ 105
Ai ∈ {0, 1}

Example
Input
2
7
0 0 1 0 0 0 1

Output
YES
*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] arr=new int[m];
   // boolean tf=true;
    int c=0;
    for(int i=0;i<m;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
        if(arr[i]==0 && (i==0 || arr[i-1]==0) && (i==m-1 || arr[i+1]==0)){
            arr[i]=1;
            c++;
            if(c==n){
                break;
            }
        }
    }
    if(c==n){
        System.out.print("YES");
    }
    else{
        System.out.print("NO");
    }
    }
}
