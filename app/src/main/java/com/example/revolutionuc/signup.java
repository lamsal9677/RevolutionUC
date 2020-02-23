package com.example.revolutionuc;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.revolutionuc.R;
import com.example.revolutionuc.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {
    EditText namee;
    EditText usernamee;
    EditText passwordd;
    //DatabaseReference databaseUsers;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //databaseUsers = FirebaseDatabase.getInstance().getReference("Users");
        namee = (EditText) findViewById(R.id.Namee);
        usernamee = (EditText) findViewById(R.id.Usernamee);
        passwordd = (EditText) findViewById(R.id.Passwordd);

        fAuth = FirebaseAuth.getInstance();

        Button register = (Button) findViewById(R.id.button2);

     register.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String name = namee.getText().toString().trim();
             String username = usernamee.getText().toString().trim();
             String password = passwordd.getText().toString().trim();

             if(TextUtils.isEmpty(name)){
                 namee.setError("Name is required");
                 return;
             }
             if(TextUtils.isEmpty(username)){
                 usernamee.setError("Username is required");
                 return;
         }
             if((password.length() < 6)){
                 passwordd.setError("Password Must be >=6 charactcers");
                 return;
             }

             fAuth.createUserWithEmailAndPassword(username,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                 @Override
                 public void onComplete(@NonNull Task<AuthResult> task) {
                     if (task.isSuccessful()){
                         Toast.makeText(signup.this, "USER CREATED", Toast.LENGTH_SHORT).show();
                     }
                     else{
                         Toast.makeText(signup.this, "ERROR!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                     }
                 }

             });

}
});
}
}

