package PatternProgramming;

public class pattern2Recursion {
    public static void Pattern(int n){
        if (n>0){
            for (int i=0 ; i<n ; i++){
                System.out.print("* ");
            }
            System.out.println();
            Pattern(n-1) ;
        }
    }
    public static void main(String[] args){
        Pattern(5);
    }
}
