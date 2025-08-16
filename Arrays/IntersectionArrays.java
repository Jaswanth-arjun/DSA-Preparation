/*

Intersection of Arrays bookmark_borderGiven two arrays of size N and M respectively, print the unique elements that appear in both arrays.
Note: The order of elements in the output must follow their first occurrence in the first array.

Input Format
The first line of input contains N - the size of the first array, followed by the elements of the first array. The next line contains a single integer M - the size of the second array, followed by the elements of the second array.

Output Format
Print the unique elements that appear in both arrays separated by a space.

Constraints
1 <= N, M <= 1000
-1000 <= ar[i] <= 1000

Example
Input
8
4 1 5 9 3 4 8 9
6
6 4 9 4 8 1

Output
4 1 9 8
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    //ArrayList<Integer> ans=new ArrayList<>();
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    int[] arrr=new int[m];
    for(int i=0;i<m;i++){
        arrr[i]=sc.nextInt();
    }
    Set<Integer> set=new HashSet<>();
    for(int i=0;i<m;i++){
       set.add(arrr[i]);
    }
    ArrayList<Integer> ans=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(set.contains(arr[i])){
            ans.add(arr[i]);
            set.remove(arr[i]);
        }
    }
    for(int nums:ans){
        System.out.print(nums+" ");
    }
    }
}
