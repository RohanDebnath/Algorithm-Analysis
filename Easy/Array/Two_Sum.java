import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Two_Sum {
    // Works on Sorted Array only --> O(nlogn)
    static ArrayList<Integer> left_right_pointerMethod(int arr[], int target) { 
        int left = 0;
        int right = (arr.length) - 1;
        while (left < right) {
            if ((arr[left] + arr[right]) == target) {
                System.out.println("Satisfied");
                break;
            } else if ((arr[left] + arr[right]) < target) {
                left++;
            } else {
                right--;
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(left);
        al.add(right);
        return al;
    }
    // Using Hasing --> O(n)

    static int[] usingHashing(int arr[], int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int y = target - arr[i];
            if (hMap.containsKey(y)) {
                return new int[] { hMap.get(y), i };
            } else {
                hMap.put(arr[i], i);
                // hMap.put(i, arr[i]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 1, 3, 5, 6, 8, 11 };
        ArrayList<Integer> al = new ArrayList<>();
        al = left_right_pointerMethod(arr, 13);
        System.out.println(al);
        int arr2[] = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int retArr[] = new int[2];
        retArr = usingHashing(arr2, 13);
        for (int i : retArr) {
            System.out.print(i + " ");
        }
    }
}