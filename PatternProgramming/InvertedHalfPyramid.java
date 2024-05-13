package PatternProgramming;

public class InvertedHalfPyramid {
    public static void main(String[] args){
        int n = 9 ;
        int var = n ;
        int count = 1 ;
        for (int i=1; i<=n; i++){
            for (int space=1; space<i; space++){
                System.out.print("  ");
            }
            for (int number=var; number>=1; number--){
                System.out.print(count+" ");
            }
            count ++ ;
            var = var - 2;
            System.out.println();
        }
    }
}
