package PatternProgramming;

public class pattern_2 {
    public static void main(String[] args){
        int i = 5;

        while (i>0){
            int j = 0;
            while (j<i) {
                System.out.print("* ");
                j++;
            }
            i-- ;
            System.out.println() ;
        }
    }
}
