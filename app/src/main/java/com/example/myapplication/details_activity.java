package com.example.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class details_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_activity);

        getIncomingIntent();

    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("image") && getIntent().hasExtra("price")){

            String imageIntent = getIntent().getStringExtra("image");
            double priceIntent = getIntent().getDoubleExtra(("price"), 0);

            SetText(imageIntent,priceIntent);

        }
    }

    private void SetText(String imageIntent, double priceIntent) {
        ImageView imageView = findViewById(R.id.image);
        Picasso.with(getApplicationContext()).load(imageIntent).into(imageView);

        TextView textView = findViewById(R.id.prix);
        textView.setText(String.valueOf(priceIntent));
    }
}
