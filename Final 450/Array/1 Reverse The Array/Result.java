import java.util.Scanner;
class Result {
    static void display(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static int[] reversal(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your Array is");
        display(arr);
        arr=reversal(arr);
        System.out.println();
        System.out.println("Your Array after Reversal");
        display(arr);
    }    
}
