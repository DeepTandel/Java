package OOPS.Static;

public class StaticSeven {
    {
        System.out.println(1);
    }
    static{
        System.out.println(2);
    }
    public static void main(String[] args) {
        
        System.out.println(3);
        StaticSeven obj = new StaticSeven();
    }
}
