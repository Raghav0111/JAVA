// 3 Basic Sort Techniques: Bubble Insertion and Selection
import java.util.*;

public class sorting {
    public static void main(String Args[]){
        Scanner sc= new Scanner (System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        InputArray(arr);

        // Bubble Sort Sabse Bda element sabse peeche Swap krdena
        //BubbleSort(arr); // Time Comlexity O(n^2)

        // Selection Sort - One Swap in one iteration. Sabse chota element swap with first element. Time Complexity 0(n^2)
        //SelectionSort(arr);

        //Insertion Sort
        for(int i =1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        PrintArray(arr);
        
    }

    public static void SelectionSort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);
    }

    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        PrintArray(arr);
    }

    public static void InputArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
