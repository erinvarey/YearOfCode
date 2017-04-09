package com.example.erin.howdrunkareyou;

/**
 * Created by Erin on 08/04/2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.Callable;

public class MyTimer  extends Thread{
    private final long time = 20000;

    private Callable<Void> callback;    // one way

    private static MyTimer instance = new MyTimer();

    // another way
    private AppCompatActivity object;
    private Intent intent;

    public static MyTimer getInstance() {
        return instance;
    }

    private MyTimer() {
    }

    public void setCallback(Callable<Void> func){
        this.callback = func;
    }

    public static void SetTimeOut(AppCompatActivity obj, Class cls){
        instance.interrupt();
        instance.intent = new Intent(obj, cls);
        instance.object = obj;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e){
            return;
        }
        /*try {
            callback.call();
        }catch (Exception e1){

        }*/
        object.startActivity(intent);

    }
}
