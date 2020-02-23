package com.example.revolutionuc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BioGrade extends AppCompatActivity {
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_grade);


        reff= FirebaseDatabase.getInstance().getReference();
        reff.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("quiz31").getValue().toString();
                String name1=dataSnapshot.child("quiz32").getValue().toString();
                String name2=dataSnapshot.child("quiz33").getValue().toString();
                String name3=dataSnapshot.child("quiz34").getValue().toString();

//                Integer binar = Integer.parseInt(name);
//                Integer binar1 = Integer.parseInt(name1);
//                Integer binar2 = Integer.parseInt(name2);
//                Integer binar3 = Integer.parseInt(name3);


                TextView t1 = findViewById(R.id.quiz1);
                TextView t2 = findViewById(R.id.quiz);
                TextView t3 = findViewById(R.id.quiz3);
                TextView t4 = findViewById(R.id.finalExam);

                t1.setText(name);
                t2.setText(name1);
                t3.setText(name2);
                t4.setText(name3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}

