package com.example.bussystem_finalproject.enterUI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bussystem_finalproject.R;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    ActionBar actionBar;
    EditText email;
    EditText password;
    Button loginadmin;
    Button loginuser;
    TextView signup;
    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup=findViewById(R.id.tv_createaccount);
        actionBar = getSupportActionBar();
        actionBar.hide();

        email=findViewById(R.id.ed_email_login);
        password=findViewById(R.id.ed_password_login);
        loginadmin=findViewById(R.id.btn_adminLogin);
        loginuser=findViewById(R.id.btn_userLogin);
        auth = FirebaseAuth.getInstance();

        loginuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Task<AuthResult> result=auth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString());
                result.addOnCompleteListener(task -> {
                    if(task.isSuccessful()){
                        Toast.makeText(Login.this, "Welcome", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(Login.this, "Faild", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Signup.class);
                startActivity(i);
            }
        });
    }
}