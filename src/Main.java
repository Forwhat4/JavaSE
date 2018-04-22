import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Main {

    public static void main(String[] args) throws Exception{
        Object o = new Object();
        o.notify();
        o.notifyAll();
        o.wait();

        Thread t = new Thread();
        t.getId();
        t.getName();
        t.getPriority();
        t.getState();
        t.join();
        t.start();

        Thread r = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread.sleep(10);

        Lock l = new Lock() {
            @Override
            public void lock() {

            }

            @Override
            public void lockInterruptibly() throws InterruptedException {

            }

            @Override
            public boolean tryLock() {
                return false;
            }

            @Override
            public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public void unlock() {

            }

            @Override
            public Condition newCondition() {
                return null;
            }
        };


    }
}
