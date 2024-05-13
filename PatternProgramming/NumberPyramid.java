package PatternProgramming;

public class NumberPyramid {
    public static void main(String[] args){
        int n = 5;
        int count = 0 ;
        for (int i=0; i<=n; i++){
            count ++ ;
            for (int space=0; space<=n-i; space++){
                System.out.print("  ") ;
            }
            for (int star=0; star<=i*2; star++){
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
