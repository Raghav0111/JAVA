import java.util.*;

public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Fibonacci(n);

    }
    public static void Fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b+ " ");
        int total = 0 ;
        for(int c = 2; c<n;c++){
            total = a+b;
            System.out.print(total + " ");
            a = b;
            b = total;
        }
    }
    
}
