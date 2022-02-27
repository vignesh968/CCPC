package com.example.ccpc;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

public class login extends AppCompatActivity {
    public Button login;
    public TextInputEditText username,pass;
    public ProgressBar load;
    public FirebaseAuth fire;
    public TextView regtv,forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pass=findViewById(R.id.ideditpass);
        forgot=findViewById(R.id.idforget);
        username=findViewById(R.id.idedtusername);
        login=findViewById(R.id.login);
        load=findViewById(R.id.loading);
        fire=FirebaseAuth.getInstance();
        regtv=findViewById(R.id.idlogin);

        regtv.setOnClickListener(v -> {
            Intent intent=new Intent(login.this,reg.class);
            startActivity(intent);

        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameid=username.getText().toString();
                load.setVisibility(View.VISIBLE);
                String password= Objects.requireNonNull(pass.getText()).toString();
                if(TextUtils.isEmpty(usernameid)&&TextUtils.isEmpty(password))
                {
                    Toast.makeText(login.this, "please enter a details", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    fire.signInWithEmailAndPassword(usernameid,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                load.setVisibility(View.GONE);
                                Toast.makeText(login.this, "Login Succesful", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(login.this,MainActivity.class);
                                startActivity(i);
                                finish();
                            }
                            else
                            {load.setVisibility(View.GONE);
                                Toast.makeText(login.this, "Fail to login", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText resetMail=new EditText(v.getContext());
                AlertDialog.Builder passwordreset=new AlertDialog.Builder(v.getContext());
                passwordreset.setTitle("Reset Password ?");
                passwordreset.setMessage("Enter Your Email To Receive Reset Link");
                passwordreset.setView(resetMail);
                passwordreset.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //extract send link to email
                     String mail=resetMail.getText().toString();
                     fire.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                         @Override
                         public void onSuccess(Void unused) {
                             Toast.makeText(login.this,"Reset Link Sent to Your Email.",Toast.LENGTH_SHORT).show();
                         }
                     }).addOnFailureListener(new OnFailureListener() {
                         @Override
                         public void onFailure(@NonNull Exception e) {
                             Toast.makeText(login.this,"Error ! Reset Link is Not Sent"+e.getMessage(),Toast.LENGTH_SHORT).show();
                         }
                     });
                    }
                });
                passwordreset.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
                passwordreset.create().show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user=fire.getCurrentUser();
        if(user!=null)
        {
            Intent intent=new Intent(login.this,MainActivity.class);
            startActivity(intent);
            this.finish();
        }
    }
}