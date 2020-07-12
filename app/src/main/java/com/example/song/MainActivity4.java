package com.example.song;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    MediaPlayer mp1;
    public void playAudio(View view) {
        mp1= MediaPlayer.create(this,R.raw.b3);
        mp1.start();
    }
    public void pauseAudio(View view)
    {
        mp1.pause();
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            View view=(View)findViewById(R.id.mylist);
            view.setBackgroundColor(Color.parseColor("#c0d876"));
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
}