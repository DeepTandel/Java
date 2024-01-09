package OOPS.Static;

public class StaticEight {
    static public void show(){
        System.out.println(1);
    }
    {
        show();
    }
    static{
        System.out.println(2);
    }
    public static void main(String[] args) {
        StaticEight obj = new StaticEight();
        System.out.println(3);
    }
}
