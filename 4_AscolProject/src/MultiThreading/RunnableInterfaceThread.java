package MultiThreading;

public class RunnableInterfaceThread {
    public static void main(String[] args) {
            Thread t1=new Thread(new EvenThread1());
        Thread t2=new Thread(new OddThread1());
        t1.start();
        t2.start();

    }
}

class EvenThread1 implements Runnable{
    @Override
    public  void run(){
        System.out.println("EvenThread Starting.....");
        for (int i=100;i<=200;i+=2){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Even:"+i);
        }
        System.out.println("EvenThread Finished...");
    }
}

class OddThread1 implements Runnable{
    @Override
    public  void run(){
        System.out.println("OddThread Starting.....");
        for (int i=101;i<=200;i += 2){
            System.out.println("Odd:"+i);
        }
        System.out.println("OddThread Finished...");
    }
}