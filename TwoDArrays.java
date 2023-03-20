import java.util.*;
public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the elements in Matrix "+ n + " X " + m);
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Searching in 2D Array

        System.out.print("Enter the element you want to search in the 2D Array: ");

        int key = sc.nextInt();

        for(int i =0 ; i<n;i++){
            for(int j =0;j<m;j++){
                if(arr[i][j] == key){
                    System.out.println("The key is present at location [" + (i+1) +"] [" + (j+1) + "]");
                }
            }
        }


    }
    public static void PrintArray(int arr[][], int n, int m){
        for(int i =0;i<n;i++){
            for(int j =0 ;j<m;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
