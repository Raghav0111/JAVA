public class TowerOfHanoiRecursion {
    public static void TowerOfHanoi(int n, String src, String hlp, String dst){

        if(n==1){
            System.out.println("Transfer Disc "+n+" from "+ src+" to "+ dst);
            return;
        }

        TowerOfHanoi(n-1, src, dst, hlp);
        System.out.println("Transfer Disc "+n+" from "+ src+" to "+ dst);
        TowerOfHanoi(n-1, hlp, src, dst);

    }
    public static void main(String args[]){
        int n = 2;
        //TowerOfHanoi(n,"S","H", "D");
        String str = "abcd";
        StringInReverse(str, str.length()-1);

        // String in Reverse using Recursion

    }

    public static void StringInReverse(String s, int idx){
        if(idx ==0 ){
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.println(s.charAt(idx));
        StringInReverse(s, idx-1);
    }
}
