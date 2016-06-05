package praneetech.saksith.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit, declare all variable
    private ListView trafficListView;
    private Button aboutmebutton;
    private String urlYoutubeString = "https://youtu.be/8AowwTeBZNw";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind Widget, link widget with variable
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmebutton = (Button) findViewById(R.id.button);

        //Controller button, write controller for button
        controlerButton();


    }   // Main Method, this is main method

    private void controlerButton() {

        aboutmebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.lamp);
                mediaPlayer.start();

                //webveiw
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlYoutubeString));
                startActivity(intent);


            }
        });


    }

}   //Main Class, this is the main class
