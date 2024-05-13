package PatternProgramming;

public class PascalsTriangle {
    public static void main(String[] args){
        int n = 5 ;
        for (int i=1; i<=n; i++){
            for (int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            int var = 1 ;
            for (int number=1; number<=i; number++){
                System.out.print(var+" ");
                var = var * (i-number) / number ;
            }
            System.out.println();
        }
    }
}
