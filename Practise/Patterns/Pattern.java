package Practise.Patterns;

class Pattern {
    public static void main(String[] args) {
        int n = 5;
        // for (int row = 1; row <= n; row++) {
        // // spaces
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(" ");
        // }

        // // stars
        // for (int col = 1; col <= n; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int row=1; row<=n; row++){
        // for(int col=1; col<=n-row+1; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int row=1; row<=n; row++){
        // //spaces finding
        // for(int col=1; col<=n-row; col++){
        // System.out.print("  ");
        // }
        // //starts
        // for(int col=1; col<=2*row-1; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int row=1; row<=n; row++){
        //     if(row == 1){
        //         continue;
        //     }
        // //spaces
        // for(int col=1; col<=row-1; col++){
        // System.out.print("  ");
        // }
        // //starts
        // for(int col=1; col<=n*2 - row - (row-1); col++){ // we can write this formula also like this (n*2-row*2+1)
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int row=1; row<=n; row++){
        // for(int col=1; col<=7; col++){
        // if(row == 1 || row == n){
        // System.out.print("* ");
        // }else{
        // if(col == 1 || col == 7){
        // System.out.print("* ");
        // }else{
        // System.out.print("  ");
        // }
        // }
        // }System.out.println();
        // }

        // for (int row = 1; row <= n; row++) {

        //     if (row == 1 || row == 2 || row == n) {
        //         for (int col = 1; col <= row; col++) {
        //             System.out.print("* ");
        //         }
        //     } else {
        //         System.out.print("* ");

        //         for (int col = 1; col <= (row - 2); col++) {
        //             System.out.print("  ");
        //         }

        //         System.out.print("* ");

        //     }
        //     System.out.println();

        // }

        // for (int row=1; row<=n; row++){
        //     for(int col=1; col<=(n-row); col++){
        //         System.out.print(" ");
        //     }

        //     if(row == 1 || row == n){
        //         for(int col=1; col<=(2 * row)-1; col++){
        //             System.out.print("* ");
        //         }
        //     } else{
        //         System.out.print("* ");

        //         for(int col=1; col<=(2*row)-3; col++){
        //             System.out.print("  ");
        //         }

        //         System.out.print("* ");
        //     }System.out.println();
        // }

        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }

            if(row == 1){
                System.out.print("*");
            }else{
                System.out.print("* ");

                for(int col=1; col<=row*2-3; col++){
                    System.out.print("  ");
                }

                System.out.print("*");
            }
            System.out.println();
        }

        for(int row=1; row<=n; row++){
            if(row == 1){
                continue;
            }

            for(int col=1; col<=row-1; col++){
                System.out.print("  ");
            }

            if(row == n){
                System.out.print("*");
            }else{
                System.out.print("*");

                for(int col=1; col<=2*(n-row)-1; col++){
                    System.out.print("  ");
                }

                System.out.print(" *");
            } 
            System.out.println();
        }

    }
}