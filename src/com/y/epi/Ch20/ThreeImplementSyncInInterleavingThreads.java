package com.y.epi.Ch20;

/**
 * Created by akasha on 2/3/16.
 */
public class ThreeImplementSyncInInterleavingThreads {

    public ThreeImplementSyncInInterleavingThreads() {
        Thread thread1 = new ThreadClass(true);
        Thread thread2 = new ThreadClass(false);
        thread1.start();
        thread2.start();
    }

}

class ThreadClass extends Thread {

    boolean isEven = false;

    public ThreadClass(boolean isEven) {
        this.isEven = isEven;
    }

    int num = 1;

    @Override
    public void run() {
        synchronized (this) {
            if (isEven) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    System.out.printf(" -> " + num++);
                    notifyAll();
                }
            } else {
                System.out.printf(" -> " + num++);
                notifyAll();
                try {
                    this.wait();
                } catch (InterruptedException e) {

                }
            }


        }
    }
}
