package com.example.revolutionuc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class physics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        findViewById(R.id.imageView4).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageView6).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageView8).setVisibility(View.INVISIBLE);

        //if first que is correct, unlock the second question and carry on
        //you can also get this on firebase
        //implement quiz
    }
}
