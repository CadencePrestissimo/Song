package com.example.song;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {


    MediaPlayer mp1;
    public void playAudio(View view) {
        mp1= MediaPlayer.create(this,R.raw.b2);
        mp1.start();
    }
    public void pauseAudio(View view)
    {
        mp1.pause();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}