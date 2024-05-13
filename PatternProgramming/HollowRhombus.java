package PatternProgramming;

public class HollowRhombus {
    public static void main(String[] args){
        int n = 5 ;
        for (int i=1; i<=n; i++){
            for (int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            if (i==1 || i==n) {
                for (int star = 1; star <= n; star++) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for (int space=1; space<=n-2; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
