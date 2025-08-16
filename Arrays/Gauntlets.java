/*
Gauntlets bookmark_borderYou have a collection of N gauntlets, each with a specific color represented by A[i]. Your goal is to maximize the number of pairs by repeatedly pairing up gauntlets of the same color. Determine the maximum number of pairs that can be formed.

Input Format
The first line of input contains an integer N. The second line of input contains an array of size N.

Output Format
For the given input, print a single line representing the answer.

Constraints
1 ≤ N ≤ 102
1 ≤ Ai ≤ 103

Example
Input
6
4 1 7 4 1 4

Output
2
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String[] arr=new String[n];
     //ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<n;i++){
        arr[i]=sc.next();
      }
        int c=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i].equals(" ")) continue;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i].equals(arr[j])){
               // arr.replace(arr[i]," ");
                //arr.replace(arr[j]," ");
                arr[i]=" ";
                arr[j]=" ";
                c++;
                break;
            }
        }
      }
     // for(int nums:arr){
        System.out.print(c);
     // }
    }
}
