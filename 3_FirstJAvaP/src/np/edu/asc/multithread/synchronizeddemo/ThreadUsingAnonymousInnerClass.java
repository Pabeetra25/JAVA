package np.edu.asc.multithread.synchronizeddemo;

public class ThreadUsingAnonymousInnerClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(i);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            }
        };
        t1.start();

    }
}

