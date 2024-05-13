package PatternProgramming;

public class Pattern11 {
    public static void main(String[] args){
        int n = 8;
        for (int i=0; i<=n; i++){
            for (int space=0; space<=n-1-i; space++){
                System.out.print("  ");
            }
            for (int star=0; star<=i; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
