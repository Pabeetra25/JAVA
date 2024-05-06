package MultiThreading;

public class ExtendingThread {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            System.out.println("main"+i);
        }
        EvenThread t1=new EvenThread();
        OddThread t2=new OddThread();
        t1.start();
        t2.start();
        System.out.println("Main thread finished!");
    }
}

class EvenThread extends Thread{
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

class OddThread extends Thread{
    @Override
    public  void run(){
        System.out.println("OddThread Starting.....");
        for (int i=101;i<=200;i +=2){
            System.out.println("Odd:"+i);
        }
        System.out.println("OddThread Finished...");
    }
}
