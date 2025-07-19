

import java.util.HashMap;

public class Two {
    public static String two(int n,int[] arr,int t){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=arr[i];
            int k=t-a;
            if(map.containsKey(k)){
                return "yes";
            }
            map.put(arr[i],i);

        }
        return "no";
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        int t = 6;
        System.out.println(two(n, arr, t)); // Output: yes
    }
}
