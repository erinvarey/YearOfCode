package com.example.erin.howdrunkareyou;


import java.util.concurrent.Callable;

/**
 * Created by Nikhil on 4/7/2017.
 */

public class MyTimer extends Thread {

    private long time = 20000;

    private Callable<Void> callback;    // one way

    private static MyTimer instance = new MyTimer();


    public static MyTimer instance(){
        return instance;
    }

    private MyTimer() {}

    public void setTime(){
        instance.time = 28000;
    }

    public void setTime(long time){
        instance.time = time;
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
            Thread.sleep(time);
        } catch (InterruptedException e){
            return;
        }
        try {
            callback.call();
        }catch (Exception e1){

        }

    }
}
