package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BrowseStations extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse_stations_layout);

        TextView currentSelection = (TextView) findViewById(R.id.browse_stations);
        currentSelection.setTextColor(Color.CYAN);

        TextView musicLibrary = (TextView) findViewById(R.id.music_library);
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BrowseStations.this, MainActivity.class);
                startActivity(intent);
            }
        });

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BrowseStations.this, NowPlaying.class);
                startActivity(intent);
            }
        });
    }
}
