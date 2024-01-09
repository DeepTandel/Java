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

class InheritenceEx3{
    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
    }
}
