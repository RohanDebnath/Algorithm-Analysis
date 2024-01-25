// Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8
// Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
// 8 is the missing number in the range since it does not appear in nums.

public class Solution {
    static int find(int arr[]){
        int sum=(arr.length*(arr.length+1))/2;
        for (int i : arr) {
            sum-=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[] = {9,6,4,2,3,5,7,0,1};
        System.out.println(find(nums));
    }
}
