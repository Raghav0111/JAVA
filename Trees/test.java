import java.util.*;

public class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        

        for(int i =0;i<n-2;i++){
            int sum = arr[i] + arr[i+2];
            System.out.println(sum);

        }
    }
}
