package com.example.song;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myList = (ListView) findViewById(R.id.mylist);
        ArrayList<String> cartoons = new ArrayList<String>();
        cartoons.add("Shinchan starting");
        cartoons.add("Shinchan ending");
        cartoons.add("Kitretsu");
        cartoons.add("Doraemon");
        cartoons.add("Oggy and the cockroaches");
        cartoons.add("Kochikame");
        cartoons.add("Phineas and Ferb");
        cartoons.add("Noddy");
        cartoons.add("Ninja Hattori");

        final MediaPlayer mp2=MediaPlayer.create(this, R.raw.b2);
        final MediaPlayer mp3=MediaPlayer.create(this, R.raw.b3);
        final MediaPlayer mp4=MediaPlayer.create(this, R.raw.b4);
        final MediaPlayer mp5=MediaPlayer.create(this, R.raw.b5);
        final MediaPlayer mp6=MediaPlayer.create(this, R.raw.b6);
        final MediaPlayer mp7=MediaPlayer.create(this, R.raw.b7);
        final MediaPlayer mp8=MediaPlayer.create(this, R.raw.b8);
        final MediaPlayer mp9=MediaPlayer.create(this, R.raw.b9);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cartoons);
        myList.setAdapter(arrayAdapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.parseColor("#c0d876"));
                if(position==0) {
                    Intent my1 = new Intent(view.getContext(), MainActivity2.class);
                    startActivityForResult(my1, 0);
                }
                if(position==1) {
                    Intent my1 = new Intent(view.getContext(), MainActivity3.class);
                    startActivityForResult(my1, 0);
                }
                if(position==2) {
                    Intent my1 = new Intent(view.getContext(), MainActivity4.class);
                    startActivityForResult(my1, 0);
                }



            }
        });
    }
}