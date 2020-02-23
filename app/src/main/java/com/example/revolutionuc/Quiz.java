package com.example.revolutionuc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.backButton) {
            Intent i = new Intent(Quiz.this, mainmenu.class);
            startActivity(i);

        }
    }
}
