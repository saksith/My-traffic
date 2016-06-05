package praneetech.saksith.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detailactivity extends AppCompatActivity {

    //Explicite
    private TextView nameTextView, detailTextview;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivity);
        //Bind widget
        nameTextView = (TextView) findViewById(R.id.textView4);
        detailTextview = (TextView) findViewById(R.id.textView5);
        imageView = (ImageView) findViewById(R.id.imageView2);

        // Show view
        String strName = getIntent().getStringExtra("Name");
        nameTextView.setText(strName);

        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        imageView.setImageResource(intImage);

        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.detail_long);
        detailTextview.setText(detailStrings[intIndex]);




    } //Main method


    public void clickBack(View view){
        finish();
    }










} // Main class

