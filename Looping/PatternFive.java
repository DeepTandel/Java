package Looping;

public class PatternFive {
    public static void main(String[] args) {
        char ch=65;
        int j ;
        for(int i=1;i<=4;i++){
            for( j=1;j<=4;j++){
                System.out.print(ch+"");
                ch++;
            }
            System.out.println();
        }
    }
}

