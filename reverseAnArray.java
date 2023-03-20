import java.util.*;
public class reverseAnArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The reversed Array is: ");
        Reverse(arr, n);
        PrintArray(arr, n);

        
    }
    public static void Reverse(int arr[], int size){
        int start = 0;
        int end = size -1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void PrintArray(int arr[], int size){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
