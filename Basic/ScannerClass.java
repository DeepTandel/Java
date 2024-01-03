import java.util.Scanner;
public class ScannerClass {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a & b ");
        a = sc.nextInt();
        b = sc.nextInt();
        int res = a + b;
        System.out.println("Addition of "+a+" and "+b+" is : "+res);
        
    }
}
