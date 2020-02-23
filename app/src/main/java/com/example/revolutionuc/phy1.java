package com.example.revolutionuc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class phy1 extends AppCompatActivity {
    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy1);

        findViewById(R.id.hide).setVisibility(View.VISIBLE);
        findViewById(R.id.see).setVisibility(View.INVISIBLE);
        TextView textView = (TextView) findViewById(R.id.Result);
        textView.setText("Select One");

        findViewById(R.id.hide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setVisibility(View.INVISIBLE);
                findViewById(R.id.Ans2).setVisibility(View.INVISIBLE);
                findViewById(R.id.Ans3).setVisibility(View.INVISIBLE);
                findViewById(R.id.Ans4).setVisibility(View.INVISIBLE);
                findViewById(R.id.Result).setVisibility(View.INVISIBLE);
                findViewById(R.id.hide).setVisibility(View.INVISIBLE);
                findViewById(R.id.see).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.see).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setVisibility(View.VISIBLE);
                findViewById(R.id.Ans2).setVisibility(View.VISIBLE);
                findViewById(R.id.Ans3).setVisibility(View.VISIBLE);
                findViewById(R.id.Ans4).setVisibility(View.VISIBLE);
                findViewById(R.id.hide).setVisibility(View.VISIBLE);
                findViewById(R.id.see).setVisibility(View.INVISIBLE);
                findViewById(R.id.Result).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.Ans1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.correct);
                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Incorrect:(");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("quiz12");
                myRef.setValue(0);
            }
        });
        findViewById(R.id.Ans2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.correct);

                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Incorrect:(");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("quiz12");
                myRef.setValue(0);

            }
        });
        findViewById(R.id.Ans3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.correct);

                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Incorrect:(");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("quiz12");
                myRef.setValue(0);
            }
        });
        findViewById(R.id.Ans4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.correct);

                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Correct!!");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("quiz12");
                myRef.setValue(1);
            }
        });

        findViewById(R.id.refresh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.shape);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.shape);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.shape);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.shape);

                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Select One");
            }
        });
    }
}
