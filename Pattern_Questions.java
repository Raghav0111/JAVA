public class Pattern_Questions {
    public static void main(String args[]){
        // Solid rectangle
        // for(int i=0;i<4;i++){
        //     for(int j = 0;j<5;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // Hollow Rectangle
        // int n = 4;
        // int m = 5;
        // for(int i = 1;i<=n;i++){
        //     for(int j = 1; j<=m; j++){
        //         //cell -> (i,j)
        //         if(i == 1 || j ==1 || i==n|| j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Printing the pattern (Half Pyramid)

        // for(int i=1;i<=4;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid
        // for(int i=4;i>=1;i--){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Half Pyramid(rotated by 180 Degrees)
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
