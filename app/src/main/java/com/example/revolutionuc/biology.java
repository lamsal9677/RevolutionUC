package com.example.revolutionuc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import javax.xml.transform.Result;

public class biology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biology);

        DatabaseReference reff;
        findViewById(R.id.imageView4).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageView6).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageView8).setVisibility(View.INVISIBLE);

        reff= FirebaseDatabase.getInstance().getReference();
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("quiz31").getValue().toString();
                String name1=dataSnapshot.child("quiz32").getValue().toString();
                String name2=dataSnapshot.child("quiz33").getValue().toString();

                Integer binar = Integer.parseInt(name);
                Integer binar1 = Integer.parseInt(name1);
                Integer binar2 = Integer.parseInt(name2);

                if (binar ==1) {

                    findViewById(R.id.imageView4).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView6).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView3).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView5).setVisibility(View.INVISIBLE);

                    if (binar == 1 && binar1 == 1 && binar2 == 1) {


                        findViewById(R.id.imageView8).setVisibility(View.VISIBLE);
                        findViewById(R.id.imageView7).setVisibility(View.INVISIBLE);
                    }
                }
                else{//binar==0
                    findViewById(R.id.imageView4).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView6).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView8).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageView3).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView5).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView7).setVisibility(View.VISIBLE);}
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        findViewById(R.id.imageView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(biology.this, bio.class);
                startActivity(i);
            }
        });

        findViewById(R.id.imageView4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(biology.this, bio1.class);
                startActivity(i);
            }
        });

        findViewById(R.id.imageView6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(biology.this, bio2.class);
                startActivity(i);
            }
        });

        findViewById(R.id.imageView8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(biology.this, biofinal.class);
                startActivity(i);
            }
        });
    }
}
