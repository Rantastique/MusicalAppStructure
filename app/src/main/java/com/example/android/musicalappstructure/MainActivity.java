package com.example.android.musicalappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button album = (Button) findViewById(R.id.album_category);
        Button artist = (Button) findViewById(R.id.artist_category);
        Button playlist = (Button) findViewById(R.id.playlist_category);
        Button browse = (Button) findViewById(R.id.browse_category);
        LinearLayout nowPlaying = (LinearLayout) findViewById(R.id.now_playing_bar);
        LinearLayout payment = (LinearLayout) findViewById(R.id.payment);

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumListActivity.class);
                startActivity(albumIntent);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistListActivity.class);
                startActivity(artistIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);
                startActivity(browseIntent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });



    }

    //checks whether the play icon is clicked and changes the icon to pause (or to play) accordingly.

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

    //checks whether the explanation text is shown/the arrow icon is clicked and changes the icon as well as the explanation title to the explanation text (and back)

    boolean isExplanationHidden = true;
    public void changeArrow(View view) {
        ImageView explainArrow = (ImageView) findViewById(R.id.explain_icon);
        TextView explanation = (TextView) findViewById(R.id.explanation_text);
        if (isExplanationHidden) {
            explainArrow.setImageResource(R.drawable.arrow_down);
            explanation.setText(getResources().getString(R.string.explanation_main));
            isExplanationHidden = false;
        } else {
            explainArrow.setImageResource(R.drawable.arrow_side);
            explanation.setText(getResources().getString(R.string.explanation_title));
            isExplanationHidden = true;
        }

    }


}

