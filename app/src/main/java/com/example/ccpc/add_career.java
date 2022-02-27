package com.example.ccpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class add_career extends AppCompatActivity {
public Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_career);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri =Uri.parse("https://www.launchmycareer.com/?utm_source=google&utm_medium=cpc&utm_campaign=&utm_adgroup=&utm_term=best%20career%20counsellor%20online&gclid=Cj0KCQiAmeKQBhDvARIsAHJ7mF49_1ulzR4gE_j2ccUe2Kv1sjEKZEvpHeJjGWqzzo7dY7UNPdjP5pQaAhKLEALw_wcB");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri =Uri.parse("https://www.merementor.com/best-career-counselling-in-chennai?gclid=Cj0KCQiAmeKQBhDvARIsAHJ7mF4GgqFBNL5rULHL4E4euHvhOunZzdegs9T4bnb3jC4a8SOn7EVp2MIaAm8KEALw_wcB");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}