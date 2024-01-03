public class ReserveOfNumber {
    public static void main(String args[]){
        int a = 123;
        int b=a%10;
        a = a/10;
        int c = a%10;
        a = a/10;
        int d = a%10;
        System.out.println(""+b+c+d);
    }
}
