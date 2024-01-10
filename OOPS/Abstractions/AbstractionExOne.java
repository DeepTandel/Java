package OOPS.Abstractions;

abstract class Test{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("m4 non-abstract method");
    }
}


class AbstractionExOne extends Test{
    void m1(){
        System.out.println("m1 abstract method");
    }
    void m2(){
        System.out.println("m2 abstract method");
    }
    void m3(){
        System.out.println("m3 abstract method");
    }
    public static void main(String[] args) {
        AbstractionExOne obj = new AbstractionExOne();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
