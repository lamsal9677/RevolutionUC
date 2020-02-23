package com.example.revolutionuc;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PhyGrade extends AppCompatActivity {
    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy_grade);

        reff= FirebaseDatabase.getInstance().getReference();
        reff.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("quiz11").getValue().toString();
                String name1=dataSnapshot.child("quiz12").getValue().toString();
                String name2=dataSnapshot.child("quiz13").getValue().toString();
                String name3=dataSnapshot.child("quiz14").getValue().toString();

//                Integer binar = Integer.parseInt(name);
//                Integer binar1 = Integer.parseInt(name1);
//                Integer binar2 = Integer.parseInt(name2);
//                Integer binar3 = Integer.parseInt(name3);


                TextView t1 = findViewById(R.id.textView17);
                TextView t2 = findViewById(R.id.textView18);
                TextView t3 = findViewById(R.id.textView19);
                TextView t4 = findViewById(R.id.textView20);

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