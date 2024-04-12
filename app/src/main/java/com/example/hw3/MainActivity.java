package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        setContentView(R.layout.activity_main);
    }
    public void phoneBtn(View view){
        Intent dial = new Intent(Intent.ACTION_DIAL);
        startActivity(dial);
    }
    public void browserBtn(View view){
        String url = "https://www.limkokwing.com/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
    public void Button(View view){
        if(view.getId() == R.id.fruitBtn){
            showFoodView("Fruit",R.drawable.fruit);
        }
        else if(view.getId() == R.id.vegBtn){
            showFoodView("Vegetable",R.drawable.veggie);
        }
        else if(view.getId() == R.id.drinkBtn){
            showFoodView("Drink",R.drawable.drink);
        }
    }
    public void showFoodView(String name, int image){
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        bundle.putInt("image", image);
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}