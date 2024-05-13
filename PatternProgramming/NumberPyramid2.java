package PatternProgramming;

public class NumberPyramid2 {
    public static void main(String[] args){
        int n = 5;
        int count = 0 ;
        for (int i=1; i<=n; i++){
            count ++ ;
            for (int space=1; space<=n-i; space++){
                System.out.print("  ") ;
            }
            for (int star=1; star<=i; star++){
                System.out.print(count+"  ");
                System.out.print(" ");
                //Or
                // System.out.print(i+"  ") ;
                // System.out.print(" ") ;
            }
            System.out.println();
        }
    }
}
