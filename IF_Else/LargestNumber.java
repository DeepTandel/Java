import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        int n1,n2,n3,n4,n5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n1,n2,n3,n4,n5 : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();

        int max;
        max = n1;
        if(max<n2){
            max=n2;
        }
        if(max<n3){
            max=n3;
        }
        if(max<n4){
            max=n4;
        }
        if(max<n5){
            System.out.println("Maximum"+n5);
        }
        else{
            System.out.println("Maximum"+max);
        }
        
    }
}
