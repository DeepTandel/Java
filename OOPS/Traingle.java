package OOPS;
import java.util.*;


public class Traingle {
    int s1,s2,s3;
    public Traingle(){
        s1=4;
        s2=5;
        s3=6;
    }
    public void area(){
        double s = (s1+s2+s3)/2;
        double ans = s*((s-s1)*(s-s2)*(s-s3));
        double ans1 = Math.sqrt(ans);
        System.out.println("Area of traingle : "+ans1);
    }
    public void perimeter(){
        System.out.println("Perimeter of traingle : "+(s1+s2+s3));
    }
}

class MyJava{
    public static void main(String[] args) {
        Traingle obj = new Traingle();
        obj.area();
        obj.perimeter();
    }
}
