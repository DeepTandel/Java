import java.util.Scanner;
public class Admission {
    public static void main(String[] args) {
       int m1,m2,m3,total,per;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the marks : ");
       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();

       System.out.print("Enter the gender : ");
       char gender = sc.next().charAt(0);

       total = m1+m2+m3;
       per = total/3;

       if((per>=62 && gender == 'f') || (per>=62 && gender=='m')){
        System.out.println("Elgible");
       }
       else{
        System.out.println("Not Elgible");
       }
    }
}
