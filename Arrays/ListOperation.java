/*
List Operations bookmark_borderYou are tasked with implementing a program that manipulates an empty list based on a series of commands.

Input Format
The first line of input contains an integer N, indicating the number of commands to follow. The next N lines contains any of the following commands:append X: Appends the integer X to the end of the list.count X: Count the number of occurrences of the integer X in the list.reverse: Reverses the order of elements in the list.insert Pos X: Inserts the integer X at the position Pos in the list.sort: Sorts the elements of the list in ascending order.index X: Gives the index of the first occurrence of the integer X in the list, or -1 if X is not found.length: Gives the length of the list.extend: Extends the list by appending it's current elements to itself.Output Format
For count, index, and length command, print the result. For the remaining commands, print the updated list separated by spaces.

Constraints
1 <= N <= 50
1 <= X <= 100
0 <= Pos < length of the list

Example
Input
10
append 13
append 7
insert 1 6
extend
index 2
reverse
index 7
length
sort
count 6

Output
13
13 7
13 6 7
13 6 7 13 6 7
-1
7 6 13 7 6 13
0
6
6 6 7 7 13 13
2
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {   
    Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
        String commandline=sc.nextLine();
        String[] parts=commandline.split(" ");
        String command=parts[0];
        switch(command){
            case "append":
            int x=Integer.parseInt(parts[1]);
            list.add(x);
            printlist(list);
            break;

            case "insert":
            int pos=Integer.parseInt(parts[1]);
            int val=Integer.parseInt(parts[2]);
            list.add(pos,val);
            printlist(list);
            break;

            case "count":
            int countval=Integer.parseInt(parts[1]);
            int count=0;
            for(int j=0;j<list.size();j++){
                if(list.get(j)==countval){
                    count++;
                }
            }
            System.out.println(count);
            break;

            case "reverse":
            int s=0,e=list.size()-1;
            while(s<e){
                int t=list.get(s);
                list.set(s,list.get(e));
                list.set(e,t);
                s++;
                e--;
            }
            printlist(list);
            break;

            case "extend":
            int size=list.size();
            for(int j=0;j<size;j++){
                list.add(list.get(j));
            }
            printlist(list);
            break;

            case "index":
            int idxval=Integer.parseInt(parts[1]);
            int idx=-1;
            for(int j=0;j<list.size();j++){
                if(list.get(j)==idxval){
                    idx=j;
                    break;
                }
            }
            System.out.println(idx);
            break;

            case "length":
            System.out.println(list.size());
            break;

            case "sort":
            for(int k=0;k<list.size()-1;k++){
                for(int j=0;j<list.size()-1-k;j++){
                    if(list.get(j)>list.get(j+1)){
                        int t=list.get(j);
                        list.set(j,list.get(j+1));
                        list.set(j+1,t);
                    }
                }
            }
            printlist(list);
            break;

            default:
            System.out.println("unknown command");
        }
    }
    sc.close();
    }
    private static void printlist(ArrayList<Integer> list){
        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j));
            if(j<list.size()-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
