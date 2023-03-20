import java.util.*;

public class ConditionalSatements {
    /* WE will be covering
     * if, else
     * else if
     * switch
     * break
     */
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // int age = sc.nextInt();

        // if(age>18){
        //     System.out.println("You are an adult");
        // }
        // else{
        //     System.out.println("Not an adult");
        // }
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a == b){
        //     System.out.println("Equal");
        // }
        // else if(a>b){
        //     System.out.println("A is greater than b");
        // }
        // else{
        //     System.out.println("A is lesser than B");
        // }
        // Switch Case
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");
        }
    }
}
