package np.edu.asc.multithread.synchronizeddemo;

public class LockingResource {
    public static void main(String[] args) {
        String classRoom="i am classroom";
        Thread ram=new Thread("Ram") {
            @Override
            public void run() {
                //name of resource we want to lock
                synchronized (classRoom) {
                    for (int i = 0; i < 5; i++) {//synchronized block
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            System.out.println(classRoom + "being used by " + Thread.currentThread().getName());
                        }

                    }
                }
            }


        };
    }
}
