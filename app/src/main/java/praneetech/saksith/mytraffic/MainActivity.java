package praneetech.saksith.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit, declare all variable
    private ListView trafficListView;
    private Button aboutmebutton;
    private String urlYoutubeString = "https://youtu.be/fLwU_JGb9Wk";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind Widget, link widget with variable
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmebutton = (Button) findViewById(R.id.button);

        //Controller button, write controller for button
        controlerButton();
        //Controler for listview
        controlerlistview();


    }   // Main Method, this is main method

    private void controlerlistview() {

        //setup for name
        final String[] nameStrings = new String[20];
        nameStrings[0] = "main item 1";
        nameStrings[1] = "main item 2";
        nameStrings[2] = "main item 3";
        nameStrings[3] = "main item 4";
        nameStrings[4] = "main item 5";
        nameStrings[5] = "main item 6";
        nameStrings[6] = "main item 7";
        nameStrings[7] = "main item 8";
        nameStrings[8] = "main item 9";
        nameStrings[9] = "main item 10";
        nameStrings[10] = "main item 11";
        nameStrings[11] = "main item 12";
        nameStrings[12] = "main item 13";
        nameStrings[13] = "main item 14";
        nameStrings[14] = "main item 15";
        nameStrings[15] = "main item 16";
        nameStrings[16] = "main item 17";
        nameStrings[17] = "main item 18";
        nameStrings[18] = "main item 19";
        nameStrings[19] = "main item 20";


        //For detail short
        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        //for image
        Mydata mydata = new Mydata();
        final int[] ints = mydata.getInts();

        // create listview
        MyAdapter myAdapter = new MyAdapter(this, ints, nameStrings, detailStrings);
        trafficListView.setAdapter(myAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, Detailactivity.class);
                intent.putExtra("Name", nameStrings[position]);
                intent.putExtra("Image", ints[position]);
                intent.putExtra("Index", position);
                startActivity(intent);
            }
        });



    }




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
