package Looping;

public class PatternFour {
    public static void main(String[] args) {
        int k=1,j=1;
        for(int i=1;i<=4;i++){
            for( j=1;j<=4;j++){
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
        }
    }
    
}