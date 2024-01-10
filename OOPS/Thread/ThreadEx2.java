package OOPS.Thread;

class MyThreadTwo implements Runnable{
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

}


class ThreadEx2 {
    public static void main(String[] args) {
        Thread obj = new Thread(new MyThread());
        obj.start();
        for(int i = 0;i<10;i++){
            System.out.println("Main Class");
        }
    }
}
