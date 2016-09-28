package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView currentSelection = (TextView) findViewById(R.id.music_library);
        currentSelection.setTextColor(Color.CYAN);

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(intent);
            }
        });

        TextView browseStations = (TextView) findViewById(R.id.browse_stations);
        browseStations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowseStations.class);
                startActivity(intent);
            }
        });

    }


}
