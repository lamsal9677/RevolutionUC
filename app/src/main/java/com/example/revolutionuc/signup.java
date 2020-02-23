package com.example.revolutionuc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {
    EditText namee;
    EditText usernamee;
    EditText passwordd;
    DatabaseReference databaseUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        databaseUsers = FirebaseDatabase.getInstance().getReference("Users");
        namee = (EditText) findViewById(R.id.Namee);
        usernamee = (EditText) findViewById(R.id.Usernamee);
        passwordd = (EditText) findViewById(R.id.Passwordd);

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });
    }
private void addUser(){
    String name1 = namee.getText().toString().trim();
    String username1 = usernamee.getText().toString().trim();
    String password1 = passwordd.getText().toString().trim();

//    String id = databaseUsers.push().getKey();
//    User user = new User(id,name1,username1,password1);
//    databaseUsers.child(id).setValue(user);
//    Toast.makeText(this,"User added", Toast.LENGTH_LONG).show();

    if ((!TextUtils.isEmpty(name1))||!(!TextUtils.isEmpty(username1))||!(!TextUtils.isEmpty(password1))){
        String id = databaseUsers.push().getKey();
        User User = new User(id,name1,username1,password1);
        databaseUsers.child(id).setValue(User);
        Toast.makeText(this,"User added", Toast.LENGTH_LONG).show();
    }
    else{
        Toast.makeText(this,"Name/Email/Password is Empty", Toast.LENGTH_LONG).show();
    }
    }
    }

