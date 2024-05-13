package PatternProgramming;

public class HollowButterfly {
    public static void main(String[] args){
        int n = 5 ;
        for (int i=1; i<=n; i++){
            System.out.print("*");
            for (int space=1; space<=i-2; space++){
                System.out.print(" ");
            }
            if (i>1){
                System.out.print("*");
            }
            for (int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int space=1; space<=i-2; space++){
                System.out.print(" ");
            }
            if (i>1){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            System.out.print("*");
            for (int space=1; space<=i-2; space++){
                System.out.print(" ");
            }
            if (i>1) {
                System.out.print("*");
            }
            for (int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int space=1; space<=i-2; space++){
                System.out.print(" ");
            }
            if (i>1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}