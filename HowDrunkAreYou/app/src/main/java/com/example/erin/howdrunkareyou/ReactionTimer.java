package com.example.erin.howdrunkareyou;

import java.util.concurrent.Callable;

/**
 * Created by Erin on 15/04/2017.
 */

public class ReactionTimer extends Thread {
    private long Countdown = 2000;

    private Callable<Void> callback;    // one way

    private static ReactionTimer instance = new ReactionTimer();


    public static ReactionTimer instance(){
        return instance;
    }

    private ReactionTimer() {}

    public void setTime(long time){
        instance.Countdown = time;
    }

    public void setCallback(Callable<Void> func){
        callback = func;
    }


    /*public void SetTimeOut(Context obj, Class cls){
        interrupt();
        intent = new Intent(obj, cls);
        object = obj.getApplicationContext();
    }*/


    @Override
    public void run() {
        try {
            Thread.sleep(Countdown);
            setTime(Countdown/2);

        } catch (InterruptedException e){
            //  return;
        }
        try {
            callback.call();
        }catch (Exception e1){

        }

    }
}
