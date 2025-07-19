package Arrays.Day3;

public class sort {
    public static int[] nums(int[] arr){
        int l=0,m=0,h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                int t=arr[l];
                arr[l]=arr[m];
                arr[m]=t;
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            
            }
            else
            {
                int t=arr[m];
                arr[m]=arr[h];
                arr[h]=t;
            h--;
                    }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr= {0, 1, 2, 0, 1, 2, 0, 1, 2};
        nums(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " "); 
        }
    }
    
}
