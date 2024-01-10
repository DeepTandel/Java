package OOPS.Thread;

public class ThreadEx3 extends Thread{
    public void run(){
        System.out.println("Inside run method");
    }
    public static void main(String[] args) {

        ThreadEx3 t1 = new ThreadEx3();
        ThreadEx3 t2 = new ThreadEx3();
        ThreadEx3 t3 = new ThreadEx3();

        System.out.println("t1 thread priority : "+t1.getPriority());
        System.out.println("t2 thread priority : "+t2.getPriority());
        System.out.println("t3 thread priority : "+t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 thread priority : "+t1.getPriority());
        System.out.println("t2 thread priority : "+t2.getPriority());
        System.out.println("t3 thread priority : "+t3.getPriority());
        
    }
}
