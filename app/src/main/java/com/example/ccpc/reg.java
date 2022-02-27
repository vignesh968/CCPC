package com.example.ccpc;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class reg extends AppCompatActivity {
    public TextInputEditText username,pass,conpass,age;
    public Button reg;
    public ProgressBar load;
    public TextView login;
    public FirebaseAuth fire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        pass=findViewById(R.id.ideditpass);
        age=findViewById(R.id.ideditages);

        username=findViewById(R.id.idedtusername);
        conpass=findViewById(R.id.ideditconpass);
        reg=findViewById(R.id.reg);
        login=findViewById(R.id.idlogin);
        load=findViewById(R.id.loading);
        fire=FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(reg.this,login.class);
                startActivity(i);
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load.setVisibility(View.VISIBLE);
                String usernameid=username.getText().toString();
                String password=pass.getText().toString();
                String conformpass=conpass.getText().toString();
                String usage=age.getText().toString();
                if(!password.equals(conformpass))
                {
                    Toast.makeText(reg.this, "Please check both", Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(usernameid)&&TextUtils.isEmpty(password)&&TextUtils.isEmpty(conformpass))
                {
                    Toast.makeText(reg.this, "Please Enter your details", Toast.LENGTH_SHORT).show();
                }

                else if(!(Integer.parseInt(usage)>=18 && Integer.parseInt(usage)<=24)){
                    Toast.makeText(reg.this, "your are under age", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    fire.createUserWithEmailAndPassword(usernameid,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful())
                            {     load.setVisibility(View.GONE);
                                Toast.makeText(reg.this, "User Registered", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(reg.this,username.class);
                                startActivity(intent);
                                finish();
                            }
                            else
                            {
                                load.setVisibility(View.GONE);
                                Toast.makeText(reg.this, "User is Already Register", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });


    }
}