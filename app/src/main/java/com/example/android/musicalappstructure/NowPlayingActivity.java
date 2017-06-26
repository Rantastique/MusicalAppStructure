package com.example.android.musicalappstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
    }

    boolean isSongPlaying = true;
    public void changeIcon(View view) {
        ImageView playing = (ImageView) findViewById(R.id.now_playing);
        if (isSongPlaying) {
            playing.setImageResource(R.drawable.pause_big);
            isSongPlaying = false;
        } else {
            playing.setImageResource(R.drawable.play);
            isSongPlaying = true;
        }

    }

    boolean isExplanationHidden = true;
    public void changeArrow(View view) {
        ImageView explainArrow = (ImageView) findViewById(R.id.explain_icon);
        TextView explanation = (TextView) findViewById(R.id.explanation_text);
        if (isExplanationHidden) {
            explainArrow.setImageResource(R.drawable.arrow_down);
            explanation.setText(getResources().getString(R.string.explanation_now_playing));
            isExplanationHidden = false;
        } else {
            explainArrow.setImageResource(R.drawable.arrow_side);
            explanation.setText(getResources().getString(R.string.explanation_title));
            isExplanationHidden = true;
        }

    }
}
