package com.example.android.musicalappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        LinearLayout nowPlaying = (LinearLayout) findViewById(R.id.now_playing_bar_details);
        LinearLayout example = (LinearLayout) findViewById(R.id.exampleOnClickListener);

        example.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exampleIntent = new Intent(PlaylistActivity.this, PlaylistDetailsActivity.class);
                startActivity(exampleIntent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
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
            explanation.setText(getResources().getString(R.string.explanation_playlists));
            isExplanationHidden = false;
        } else {
            explainArrow.setImageResource(R.drawable.arrow_side);
            explanation.setText(getResources().getString(R.string.explanation_title));
            isExplanationHidden = true;
        }

    }
}
