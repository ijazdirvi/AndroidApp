package com.ijazsunny37.fyphomesecuritysystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by apple on 19/8/17.
 */

public class Splash_Activity extends Activity {
    @Override
    protected void onCreate(Bundle sunnylove) {
        super.onCreate(sunnylove);
        setContentView(R.layout.layout_splash);

        Thread timer =new Thread(){
            public void run(){
                try {
                    sleep(5000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openStartingPoint = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }
    }