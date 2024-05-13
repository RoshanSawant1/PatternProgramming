package PatternProgramming;

public class NumberPattern1 {
    public static void main(String[] args){
        int n = 5 ;
        for (int i=0; i<=n; i++){
            int temp = 1 ;
            for (int j=0; j<=i; j++){
                System.out.print(temp+++" ");
            }
            System.out.println();
        }
    }
}
