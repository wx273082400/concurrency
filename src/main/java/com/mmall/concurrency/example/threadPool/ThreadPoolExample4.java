package com.mmall.concurrency.example.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ThreadPoolExample4 {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executorService.schedule(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {

                    }
                    log.warn("schedule run");
                }
            }, 5, TimeUnit.SECONDS);
        }


//        executorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1500);
//                } catch (Exception e) {
//
//                }
//                log.info("schedule run");
//            }
//        }, 1, 3, TimeUnit.SECONDS);
       //executorService.shutdown();

//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                log.warn("timer run");
//            }
//        }, new Date(), 5 * 1000);
    }
}
