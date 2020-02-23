package com.example.revolutionuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
    }
    public void onButtonClick(View v) {
        if(v.getId() == R.id.studyButton)
        {
            Intent i = new Intent(mainmenu.this, Study.class);
            startActivity(i);

        }
        if(v.getId() == R.id.quizButton)
        {
            Intent i = new Intent(mainmenu.this, Quiz.class);
            startActivity(i);

        }
        if(v.getId() == R.id.gradeButton)
        {
            Intent i = new Intent(mainmenu.this, Grade.class);
            startActivity(i);

        }
        if(v.getId() == R.id.logOutButton)
        {
         Intent i = new Intent(mainmenu.this, MainActivity.class);
        startActivity(i);

        }
  }
}
