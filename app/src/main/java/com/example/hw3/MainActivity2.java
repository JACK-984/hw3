package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle newBundle = getIntent().getExtras();
        String name = newBundle.getString("name");
        int image = newBundle.getInt("image");
        TextView textview = findViewById(R.id.foodName);
        ImageView imgView = findViewById(R.id.foodImg);
        textview.setText(name);
        imgView.setImageResource(image);
    }

}