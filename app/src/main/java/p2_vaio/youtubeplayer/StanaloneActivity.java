package p2_vaio.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StanaloneActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stanalone);
        Button b1 = (Button)findViewById(R.id.video);
        Button b2 = (Button)findViewById(R.id.playlist);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent =null;

        if(view.getId()==R.id.playlist){
            intent = YouTubeStandalonePlayer
                    .createPlaylistIntent(StanaloneActivity.this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_PLAYLIST,0,0,true,true);

        }
        if(view.getId()==R.id.video){
            intent = YouTubeStandalonePlayer
                    .createVideoIntent(StanaloneActivity.this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_VIDEO_ID,0,true,false);
        }
        if(intent!=null){
            startActivity(intent);
        }
    }
}
