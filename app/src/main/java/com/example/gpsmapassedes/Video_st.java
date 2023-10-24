package com.example.gpsmapassedes;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_st extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_st);

        VideoView MiVideito = findViewById(R.id.videoView);

        String videito = "android.resource://"+getPackageName()+"/"+R.raw.admision;
        Uri uri = Uri.parse(videito);
        MiVideito.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        MiVideito.setMediaController(mediaController);
        mediaController.setAnchorView(MiVideito);
    }
}