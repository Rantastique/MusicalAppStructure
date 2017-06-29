package com.example.android.musicalappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);


        LinearLayout nowPlaying = (LinearLayout) findViewById(R.id.now_playing_bar_details);
        LinearLayout song = (LinearLayout) findViewById(R.id.song_example);
        LinearLayout playlist = (LinearLayout) findViewById(R.id.playlist_example);

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(BrowseActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent (BrowseActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent (BrowseActivity.this, PlaylistDetailsActivity.class);
                startActivity(playlistIntent);
            }
        });
    }

    boolean isSongPlaying = true;
    public void changeIcon(View view) {
        ImageView playing = (ImageView) findViewById(R.id.now_playing);
        if (isSongPlaying) {
            playing.setImageResource(R.drawable.pause);
            isSongPlaying = false;
        } else {
            playing.setImageResource(R.drawable.play_dark);
            isSongPlaying = true;
        }

    }

    boolean isExplanationHidden = true;
    public void changeArrow(View view) {
        ImageView explainArrow = (ImageView) findViewById(R.id.explain_icon);
        TextView explanation = (TextView) findViewById(R.id.explanation_text);
        if (isExplanationHidden) {
            explainArrow.setImageResource(R.drawable.arrow_down);
            explanation.setText(getResources().getString(R.string.explanation_browse));
            isExplanationHidden = false;
        } else {
            explainArrow.setImageResource(R.drawable.arrow_side);
            explanation.setText(getResources().getString(R.string.explanation_title));
            isExplanationHidden = true;
        }

    }
}
