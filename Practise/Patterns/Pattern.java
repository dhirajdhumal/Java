package Practise.Patterns;

class Pattern {
    public static void main(String[] args) {
        int n = 4;
        // for (int row = 1; row <= n; row++) {
        //     // spaces
        //     for (int col = 1; col <= n - row; col++) {
        //         System.out.print(" ");
        //     }

        //     // stars
        //     for (int col = 1; col <= n; col++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int row=1; row<=n; row++){
        //     for(int col=1; col<=n-row+1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int row=1; row<=n; row++){
        //     //spaces finding 
        //     for(int col=1; col<=n-row; col++){
        //         System.out.print(" ");
        //     }
        //     //starts
        //     for(int col=1; col<=2*row-1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for(int row=1; row<=n; row++){
            //spaces
            for(int col=1; col<=row-1; col++){
                System.out.print(" ");
            }
            //starts
            for(int col=1; col<=n*2 - row - (row-1); col++){ // we can write this formula also like this (n*2-row*2+1)
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}