import java.util.*;
public class MoneySystem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Amount : ");
        int n=sc.nextInt();
        System.out.println("Enter Range : ");
        int r=sc.nextInt();
        
        switch(r){
            case 2000:
            int n1=n/2000;
             n=n%2000;
            System.out.println("2000-->"+n1+" = "+2000*n1);
            
            case 500:
            int n3=n/500;
             n=n%500;
            System.out.println("500-->"+n3+" = "+500*n3);

            case 200:
            int n4=n/200;
             n=n%200;
            System.out.println("200-->"+n4+" = "+200*n4);

            case 100:
            int n5=n/100;
             n=n%100;
            System.out.println("100-->"+n5+" = "+100*n5);

            case 50:
            int n6=n/50;
             n=n%50;
            System.out.println("50-->"+n6+" = "+50*n6);

            case 10:
            int n7=n/10;
             n=n%500;
            System.out.println("10-->"+n7+" = "+10*n7);

            case 5:
            int n8=n/5;
             n=n%5;
            System.out.println("5-->"+n8+" = "+5*n8);

            case 2:
            int n9=n/2;
             n=n%2;
            System.out.println("2-->"+n9+" = "+2*n9);

            case 1:
            int n10=n/1;
             n=n%1;
            System.out.println("1-->"+n10+" = "+1*n10);
            break;
        }
    }
}
