package com.example.revolutionuc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Study extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.backButton) {
            Intent i = new Intent(Study.this, mainmenu.class);
            startActivity(i);

        }
        if (v.getId() == R.id.phyButton) {
            Intent i = new Intent(Study.this, StudyPhysics.class);
            startActivity(i);

        }
        if (v.getId() == R.id.chemButton) {
            Intent i = new Intent(Study.this, StudyChemistry.class);
            startActivity(i);

        }
        if (v.getId() == R.id.bioButton) {
            Intent i = new Intent(Study.this, StudyBio.class);
            startActivity(i);

        }
    }
}
