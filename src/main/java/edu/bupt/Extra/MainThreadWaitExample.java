package edu.bupt.Extra;

import java.util.concurrent.CountDownLatch;

public class MainThreadWaitExample {

    public static void main(String[] args) {
        int threadCount = Runtime.getRuntime().availableProcessors();
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " is working!");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            }, "Worker" + i).start();
        }

        try {
            latch.await();
            System.out.println("all threads finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
