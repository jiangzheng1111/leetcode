package edu.bupt.Extra;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        int threadCount = Runtime.getRuntime().availableProcessors();
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + "complete");
                } finally {
                    latch.countDown();
                }
            }).start();
        }

        latch.await();
        System.out.println("all tasks completed");
    }
}
