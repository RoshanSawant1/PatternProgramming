package PatternProgramming;

public class HalfPyramid {
    public static void main(String[] args){
        int n = 5 ;
        for (int i=0; i<=n; i++){
            for (int space=1; space<=n-i; space++){
                System.out.print("  ");
            }
            for (int number=0; number<=i*2; ){
                number++ ;
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
