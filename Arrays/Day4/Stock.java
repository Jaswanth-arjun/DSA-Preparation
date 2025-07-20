package Arrays.Day4;

public class Stock {
    public static int max(int[] arr){
        int m=arr[0];
        int p=0;
        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-m;
            p=Math.max(p,cost);
            m=Math.min(m,arr[i]);
        }
        return p;   
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(max(arr)); // Output: 5
    }
}
