package com.example.hp.space;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jgabrielfreitas.core.BlurImageView;

public class start extends AppCompatActivity {

    int count;
    private BlurImageView blurImgcultural;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        blurImgcultural = (BlurImageView) findViewById(R.id.blurimgcultural1);
        blurImgcultural.setBlur(2);

        Thread t =  new Thread(){
            @Override
            public void run() {
                while(!isInterrupted()){
                    try {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                count++;

                                if (count == 3) {
                                    Intent openmainactivity = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(openmainactivity);
                                    overridePendingTransition(R.anim.slider_in_left, R.anim.slide_out_left);
                                }
                            }
                        });
                    }

                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }
}
