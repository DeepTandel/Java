import java.util.Scanner;
public class GradeMark {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m1,m2,m3,m4;
        int total,per;
        System.out.print("Enter the value of m1,m2,m3,m4 : ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();

        total=m1+m2+m3+m4;
        per = total/4;

        if(per>=90){
            System.out.println("Grade : A");     
        }
        else if(per>=80 && per<90){
            System.out.println("Grade : B");
        }
        else if(per>=70 && per<80){
            System.out.println("Grade : C");
        }
        else if(per>=60 && per<70){
            System.out.println("Grade : D");
        }
        else if(per>=40 && per<60){
            System.out.println("Grade : E");
        }
        else{
            System.out.println("Fail");
        }

    }
}
