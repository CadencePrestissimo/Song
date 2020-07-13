package com.example.song;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cartoons);
        myList.setAdapter(arrayAdapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {

                if(position==0) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity2.class);
                    startActivityForResult(my, 0);

                }
                if(position==1) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity3.class);
                    startActivityForResult(my, 0);
                }
                if(position==2) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity4.class);
                    startActivityForResult(my, 0);
                }
                if(position==3) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity5.class);
                    startActivityForResult(my, 0);
                }
                if(position==4) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity6.class);
                    startActivityForResult(my, 0);
                }
                if(position==5) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity7.class);
                    startActivityForResult(my, 0);
                }
                if(position==6) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity8.class);
                    startActivityForResult(my, 0);
                }
                if(position==7) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity9.class);
                    startActivityForResult(my, 0);
                }
                if(position==8) {
                    view.setBackgroundColor(Color.parseColor("#c0d876"));
                    Intent my = new Intent(view.getContext(), MainActivity10.class);
                    startActivityForResult(my, 0);
                }

            }
        });
    }
}