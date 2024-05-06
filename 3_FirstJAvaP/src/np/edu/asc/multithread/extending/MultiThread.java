package np.edu.asc.multithread.extending;
//achieve multithreading by extending thread class

public class MultiThread extends Thread{
    @Override
    public void run(){

        MultiThread.print();
    }
    public static void print() {
        for (int i = 0; i < 4; i++) {
            System.out.println("hello world from " + Thread.currentThread().getName());
            System.out.println("my priority is " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
    public static void main(String[] args){
MultiThread mt1=new MultiThread();
MultiThread mt2=new MultiThread();
        mt1.setPriority(1);//1
        mt2.setPriority(Thread.MAX_PRIORITY);//10
mt1.start();
mt2.start();


    }
}
