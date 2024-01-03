import java.util.Scanner;
public class CostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        double cp,ds;
        System.out.print("Enter the cost price : ");
        cp=sc.nextDouble();
        System.out.print("If you are student or not (y/n) : ");
        ch=sc.next().charAt(0);

        if(ch=='y'){
            if(cp>500){
                ds = 0.1 * cp;
            }
            else{
                ds = 0.05 * cp;
            }
        }
        else {
            if(cp>500){
                ds = 0.08 * cp;
            }
            else{
                ds = 0.02 * cp;
            }
        }

        System.out.println("Cost Price : "+cp);
        System.out.println("Discount : "+ds);
        double total = cp - ds ;
        System.out.println("Net Cost Price : "+total);
    }
}
