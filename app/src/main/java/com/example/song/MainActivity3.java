package com.example.song;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final MediaPlayer mMediaPlayer=MediaPlayer.create(this, R.raw.b2);
        final SeekBar yourSeekbar = (SeekBar) findViewById(R.id.seekBar);
        yourSeekbar.setMax(mMediaPlayer.getDuration());

        final Handler mSeekbarUpdateHandler = new Handler();
        Runnable mUpdateSeekbar = new Runnable() {
            @Override
            public void run() {

                new Thread(new Runnable() {
                    public void run(){
                        yourSeekbar.setProgress(mMediaPlayer.getCurrentPosition());
                        mSeekbarUpdateHandler.postDelayed(this, 50);
                    }
                }).start();
            }
        };

        mSeekbarUpdateHandler.postDelayed(mUpdateSeekbar, 0);
        mSeekbarUpdateHandler.removeCallbacks(mUpdateSeekbar);

        yourSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser)
                    mMediaPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        mMediaPlayer.start();
        Button b=(Button)findViewById(R.id.button2);
        Button b1=(Button)findViewById(R.id.button);
        b.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.pause();
            }
        });
        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.start();
            }
        });
    }
}