package OOPS.Static;

public class StaticFive {
    static int n=10;
    static public void show(){
        System.out.println(n);
    }
    static{
        show();
    }
    public static void main(String[] args) {
        n++;
        System.out.println(n);
    }
}
