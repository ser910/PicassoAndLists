package com.example.student.picassoandlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    public static final String IMAGE_URL = "http://www.kiranashopee.in/uploadsimg/Mid/266_Kaju-Cashew.jpg";

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void onButtonClick(View view) {
        Picasso
                .with(this)
                .load(IMAGE_URL)
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
    }
}
