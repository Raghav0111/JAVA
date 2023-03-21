import java.util.*;
public class strings {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is: " + name);
        // System.out.println(name.length());

        // // CharAt
        // for(int i=0;i<name.length();i++){
        //     System.out.println(name.charAt(i));
        // }

        // Compare
        // String name1 = "Tony";
        // String name2 = "Tony2";

        // //1 s1> s2 : +ve value
        // //2 s1 == s2: 0
        // //3 s1<s2 : -ve value 

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
        // Substring .substring(starting index, ending index)

        // Strings are immutable

        // String Builder -- Time bhot zyada save hojata hai
        
        // StringBuilder sb = new StringBuilder("Tony");
        
        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // Set Char at Index 0
        // sb.setCharAt(0, 'T');
        // System.out.println(sb);

        // // Insert Char at Index 0

        // sb.insert(0, 'S');
        // System.out.println(sb);
        
        // // Delete the Index
        // sb.delete(1, 2);

        StringBuilder sv = new StringBuilder("h");
        sv.append("e");
        sv.append("l");
        sv.append("l");
        sv.append("o");
        System.out.println(sv);
    }
}
