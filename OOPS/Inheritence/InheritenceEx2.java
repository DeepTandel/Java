package OOPS.Inheritence;


class A{
    public void showA(){
        System.out.println(1);
    }
}
class B extends A{
    public void showB(){
        System.out.println(2);
    }
}
class C extends A{
    public void showC(){
        System.out.println(3);
    }
}
class D extends A{
    public void showC(){
        System.out.println(3);
    }
}


class InheritenceEx2{
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showC();
    }
}
