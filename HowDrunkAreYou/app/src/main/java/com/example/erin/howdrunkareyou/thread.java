package com.example.erin.howdrunkareyou;

/**
 * Created by Erin on 05/04/2017.
 */

public class thread extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long end = start + 20*1000; // 60 seconds * 1000 ms/sec
        while(System.currentTimeMillis() < end) {
        }
        if (spellingtest.one) {
            spellingtest.var.TimeOut();
        }
        if(spellingtest2.two){
            spellingtest2.var.TimeOut();
        }
        if(spellingtest3.three){
            spellingtest3.var.TimeOut();
        }

    }
}
