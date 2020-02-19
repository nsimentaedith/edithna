package com.example.edithna;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class life1 extends AppCompatActivity {
    MediaPlayer mPlayer;

    Button buttonPLAY;

    Button buttonPAUSE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life1);
        buttonPLAY= (Button)findViewById(R.id.button1);

        buttonPLAY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.medd);//Create MediaPlayer object with MP3 file under res/raw folder
                mPlayer.start();//Start playing the music
            }

        });
        buttonPAUSE = (Button) findViewById(R.id.button2);
        buttonPAUSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlayer != null && mPlayer.isPlaying()) {//If music is playing already
                    mPlayer.stop();//Stop playing the music

                }
            }
        });

    }}





