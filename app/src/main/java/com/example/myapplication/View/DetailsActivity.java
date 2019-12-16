package com.example.myapplication.View;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

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
