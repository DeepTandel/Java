package OOPS.Abstractions;

abstract class A{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("M4 is non abstract method");
    }
}


abstract class B extends A{
    void m1(){
        System.out.println("M1 is abstract method");
    }
}

abstract class C extends B{
    void m2(){
        System.out.println("M2 is abstract method");
    }
}

abstract class D extends C{
    void m3(){
        System.out.println("M3 is abstract class");
    }
}

class AbstractionExTwo extends D{
    public static void main(String[] args) {
        AbstractionExTwo obj = new AbstractionExTwo();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
