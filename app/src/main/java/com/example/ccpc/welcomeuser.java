package com.example.ccpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.file.WatchEvent;

public class welcomeuser extends AppCompatActivity {
public TextView welcome;
public Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomeuser);
        welcome=findViewById(R.id.welcome);
        String weluser = getIntent().getStringExtra("name");
        welcome.setText(weluser);
        b=findViewById(R.id.NEXT);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(welcomeuser.this,MainActivity.class);

                startActivity(i);
            }
        });

    }
}