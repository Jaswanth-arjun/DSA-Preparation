package Arrays.Day5;
import java.util.ArrayList;

public class Leaders {
    public static ArrayList<Integer> led(int[] arr){
        ArrayList<Integer>  ans=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                ans.add(max);
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = led(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
