/*Given an array arr[], return the element that appears more than n / 2 times, where n is the array size. If no such element exists, return -1.

Examples:

Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
Output: 1
Explanation: Element 1 appears 4 times, which is more than 
7
2
=
3.5
2
7
​
 =3.5 so it is the majority element.

Input: arr[] = [7]
Output: 7
Explanation: Element 7 appears once in an array of  size 1, satisfying the condition 
1
>
1
2
1> 
2
1
​
 , so it is the majority element.

Input: arr[] = [2, 13]
Output: -1
Explanation: No element appears more than 
2
2
=
1
2
2
​
 =1 time, so there is no majority element.*/



    class Maj {
    public static int maj(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            if (c > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println("Majority Element: " + maj(arr));
    }
}
