package com.y.Misc;

/**
 * Created by akasha on 2/23/16.
 */
class CommonClass {

    int data;

    public CommonClass(int data) {
        this.data = data;
    }

    public synchronized void decreaseData() throws Exception {
        System.out.println("Thread " + Thread.currentThread().getName() + " inside decreasing data");
        Thread.sleep(1000);
        this.data--;
        System.out.println("Thread " + Thread.currentThread().getName() + " waiting for increasing data");

        increaseData();
    }

    public synchronized void increaseData() throws Exception {
        System.out.println("Thread " + Thread.currentThread().getName() + " inside increasing data");

        Thread.sleep(1000);
        this.data++;
        System.out.println("Thread " + Thread.currentThread().getName() + " waiting for decreasing data");

        decreaseData();
    }
}

class Thread1 extends Thread {
    CommonClass common;

    public Thread1(CommonClass c) {
        this.common = c;
    }

    public void run() {
        try {
            this.common.decreaseData();
        } catch (Exception e) {
            System.out.printf("Exception occurred");
        }
    }
}

class Thread2 extends Thread {
    CommonClass common;

    public Thread2(CommonClass c) {
        this.common = c;
    }

    public void run() {
        try {
            this.common.increaseData();
        } catch (Exception e) {
            System.out.printf("Exception occurred");
        }
    }
}

public class DeadLock {

    public static void main(String[] args) {
        CommonClass cc = new CommonClass(10);
        Thread thread1 = new Thread1(cc);
        Thread thread2 = new Thread2(cc);
        thread1.start();
        thread2.start();
    }
}

