package com.example.revolutionuc;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.text.TextUtils;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.database.ChildEventListener;
        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText usernamee;
    EditText passwordd;
    FirebaseAuth fAuth;
    Button signinn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernamee = (EditText) findViewById(R.id.Username);
        passwordd = (EditText) findViewById(R.id.Password);
        fAuth = FirebaseAuth.getInstance();
        signinn = findViewById(R.id.button2);

        TextView signup = (TextView) findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

        signinn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Usernamee = usernamee.getText().toString().trim();
                String Passwordd = passwordd.getText().toString().trim();

                if(TextUtils.isEmpty(Usernamee)){
                   // Username.setError("Username is required");
                    //return;
                }
                if((Passwordd.length() < 6)){
                    //Password.setError("Password Must be >=6 charactcers");
                   // return;
                }

                //auth user

                fAuth.signInWithEmailAndPassword(Usernamee,Passwordd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                            
                        }
                        else{
                            Toast.makeText(MainActivity.this, "ERROR!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

   public void signup(){
        Intent intent = new Intent(this, com.example.revolutionuc.signup.class);
        startActivity(intent);

    }

}
