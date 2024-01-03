import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        int n1,n2,n3,n4,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1,n2,n3,n4 : ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        min=n1;
        if(min>n2){
            min=n2;
        }
        if(min>n3){
            min=n4;
        }
        if(min>n4){
            System.out.println("Minimun value is "+n4);
        }
        else{
            System.out.println("Minimum value is "+min);
        }
    }
}
