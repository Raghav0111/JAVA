import java.util.*;

class FirstClass{
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.print("Hello World \n");
        // 3 ways to display output 1.Print 2.Println 3. "\n"
        //variables
        String name = "Tony Stark";
        int a = 25;
        int b = 10;
        int sum = a+b;
        System.out.println(sum);
        int diff = a-b;
        System.out.println(diff);

        Scanner sc = new Scanner (System.in);
        // String Name = sc.next();
        // System.out.println(Name);
        // //But next is used for a single token. To use Full name, we use nextLine
        String NName = sc.nextLine();
        System.out.println(NName);
        //nextInt
        //nextFloat

        

        // We take inputs in java using scanner class

    }
} 