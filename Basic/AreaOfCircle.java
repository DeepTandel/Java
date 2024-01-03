public class AreaOfCircle{
    public void area(){
        double r=5;
        double area = 3.14 * r * r;
        System.out.println("Area of circle : "+area);
    }

    public void cOC(){
        double r=3;
        double coc = 2 * 3.14 * r;
         System.out.println("Circumference of circle : "+coc);
    }
    public static void main(String args[]){
        AreaOfCircle obj = new AreaOfCircle();
        obj.area();
        obj.cOC();
    }
}