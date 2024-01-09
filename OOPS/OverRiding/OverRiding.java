package OOPS.OverRiding;

class Parent{
    int cash=3000;
    public void properties(){
        System.out.println("Properties");
    }
    public void bike(){
        System.out.println("Splender");
    }
}
class Child extends Parent{
    int cash =2000;
    public void bike(){
        System.out.println("HB");
        System.out.println(cash);
    }
}

class OverRiding {
    public static void main(String[] args) {
        Child obj = new Child(); 
        obj.properties();
        obj.bike();
    }
}
