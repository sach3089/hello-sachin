package java8Practice;

class Go implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("go");
        }
    }
}
class Fast implements Runnable{

    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.println("fast!");
        }
    }
}

public class ThreadDemoUsingRunnable {
    public static void main(String[] args) {
        Go g1 = new Go();
        Fast F = new Fast();
        g1.run();
        F.run();
    }
}
