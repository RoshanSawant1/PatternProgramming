package PatternProgramming;

public class PalindromicPattern {
    public static void main(String[] args){
        int n=5 ;
        for (int i=1; i<=n; i++){
            for (int space=1; space<=n-i; space++){
                System.out.print("  ") ;
            }
            for (int number=i; number>=1; number--){
                System.out.print(number+" ");
            }
            for (int number=2; number<=i; number++){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
