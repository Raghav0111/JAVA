import java.util.*;

public class loops {
    // For Loops. Mostly same as c++
    public static void main(String args[]){
        // for(int i=0; i<10;i++){
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);
        // //While Loops
        // int i = 0;
        // while(i<10){
        //     System.out.println(i);
        //     i++;
        // }
        // int j = 21;
        // do{
        //     System.out.println(j);
        //     j++;
        // }while(j<31);

        // Print First N natural Numebers
        int n = sc.nextInt();
        int res = 0;
        for(int i =1;i<=n;i++){
            res+=i;
        }
        System.out.println(res);
    }
}
