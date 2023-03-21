import java.util.*;
public class recursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum =0;
        // //PrintNumber(n);

        // // Calculate sum of first n natural Numbers
        // int res = printSum(n);
        // System.out.println(res);


        // Factorial
        // int res = Factorial(n);
        // System.out.println(res);

        // Print Fibonacci Sequence using Recursion

        int a =0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n-2);


    }

    public static void printFib(int a, int b , int n){
        if(n ==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);

    }
    public static int Factorial(int n){
        if(n==1|| n == 0){
            return 1;
        }
        int fact_nm1 = Factorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static int printSum(int n){
        if(n==0){
            return 0;
        }
        int next_num = printSum(n-1);
        int res = n+ next_num;
        return res;

    }
    public static void PrintNumber(int n){
        if(n ==0 ){ // Base Case
            return;
        }
        System.out.println(n); // Print
        PrintNumber(n-1); // Recursion
    }
}
