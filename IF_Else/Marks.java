import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of three paper : ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int total = m1+m2+m3;
        int per=total/3;
        if(per<45){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
}
