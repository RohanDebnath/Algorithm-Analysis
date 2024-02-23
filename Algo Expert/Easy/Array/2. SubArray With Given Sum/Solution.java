// Input:
// S = 15
// A[] = {1,2,3,4,5,6,7,8,9,10}
// Output: 1 5
// Explanation: The sum of elements 
// from 1st position to 5th position is 15.

// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position is 12.
import java.util.ArrayList;

public class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int s) {
        ArrayList<Integer> al = new ArrayList<>();
        int l = 0;
        int r = 0;
        int sum = 0;
        while (r<arr.length) {
            if (sum == s) {
                break;
            } else if (sum < s) {
                sum += arr[r];
                r++;
            } else if (sum > s) {
                sum -= arr[l];
                l++;
            }
        }
        if (sum == s) {
            al.add(l + 1);
            al.add(r);
            return al;
        }
        al.add(-1);
        return al;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int B[] = { 1, 2, 3, 7, 5 };
        ArrayList<Integer> al = new ArrayList<>();
        al = subarraySum(A, 15);
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
        System.out.println();
        al = subarraySum(B, 12);
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
    }
}
