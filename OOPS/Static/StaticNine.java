package OOPS.Static;

public class StaticNine {
    public void show(){
        System.out.println(1);
    }
    static public void show1(){
        System.out.println(2);
    }
    {
        show();
    }
    static{
        show1();
    }
    public static void main(String[] args) {
        StaticNine obj = new StaticNine();
        System.out.println(3);
    }
}
