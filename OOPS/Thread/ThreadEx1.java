package OOPS.Thread;


class MyThread extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}

public class ThreadEx1 {
    public static void main(String[] args) {
        Thread obj = new Thread(new MyThread());
        obj.start();
        for(int i = 0;i<10;i++){
            System.out.println("Main Class");
        }
    }
}
