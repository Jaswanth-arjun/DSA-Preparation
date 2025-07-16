class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        
        if (index != -1) {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[index]) {  
                    int temp = nums[i];       
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
        }

      
        if (index == -1) {
            reverse(nums, 0, n - 1);
        } else {
            reverse(nums, index + 1, n - 1);
        }
    }

    
    private void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
}
