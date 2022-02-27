package com.example.ccpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class add_interview extends AppCompatActivity {
public Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_interview);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri =Uri.parse("https://www.preplaced.in/?gclid=Cj0KCQiAmeKQBhDvARIsAHJ7mF5C1TB-G6INTJ0DFrin9J6wDQbmISzSqkk9jFtCdy7NxtAPayDKRaEaAp2BEALw_wcB");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri =Uri.parse("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiotNqa2pr2AhWTMysKHTARBGAYABACGgJzZg&ae=2&dsh=1&agsac=QIHxPPeps-4&cit=CkQKCAiAmeKQBhBIEjQAKzFomB2ua3B2JqtmmTB0lL2fEJdbYH8HD_ct_MAy8fK_exd8KDkpAmQFx22DB--dND5GGgIYJvD_BwE&ohost=www.google.com&cid=CAESwwHg9t6RGzqqZFT5AQh55bE8DhSR3y52pOkQ46GWr5pHH_mARWJQm2QdAmYTWXVYBdY8wRGTw4WpUBLjP_GqaPlkpNC3fXUeiPR84DQt9W6OjlzKkloKz4WJ01GI0u6evqcPw-IqcLbzypPYjAzAHz3VsEVSNZcxCkVpZPNZyznBp4RDsMFN3ZkfFzk0l7UssygFSmT1MqywPYUaeoY-7kk9AUQEAdNj5pVGLEpFkiIdNsTY59jdbyCH98k1IhZuwXqwBf4&sig=AOD64_1Q-Vdsjp0FYorqKGW9QPNHXQqu0Q&q&adurl&ved=2ahUKEwj4sdKa2pr2AhXYxDgGHTdIBKgQ0Qx6BAgGEAE&ms=CoACJsPpsOMWgCLT4TIoBXxOHzOEfdCubnGbKl3vIOr3-m5B6aysm3utM-YJZRDDFGHhwQEhaD8rr65ROVKM5a-3jW7--prLmX6mRJ-iAmiOSU9bTF_U6azmXqW_UOOS7aIRocJyZw2xtG2dSudmn4S1HbfuCc42wge9MeChyaQPOS7I055QOFjwRxYPvv39o_hAQ0C7GOSjgtnnwdn9nwczH_bs6f6SLwz7dGfjC74OVwNdthSFQE743AJa6jGg-XXZKEsls-jIHpFFV8Q_INL-tqBzy935irhOKOegvI62bYcn-M7AW7xULatREYaW7Sc9NpiURXDFGJys-A1E8vg_rgqAAsYcHqeFg_dU_DeRxmaVdAAwu8wfbB75m4oPNjTZU6ZWKt68Jm-1VsTT6OEOSDGmMj0MDCePmxlvJaH2af2YYBuxs7wphjozdvimdOoQ_wgj1uqDFxO4y3SCyb0c2rPWElEsP3mBFRYj36BClFhafScLyJ_mF9kc_XL_lcENjDuU8CPJGG09-v4EaUyZojGbaa2n4tSTOkrrUhiliFgaC6YOnQDI8jJrbOBnVb1a0eGSboNsX68JBjPvWUQvWQF6JqxwfZRjKGmwkLHphxLWJQ7L-NEUGa_jRzmEMt_jDZA8tK3RbKY8QFKn-A-Bf09k62upWezcuMpUMBBEkLR2364SEN5lAfiTKKxp2ADtGcN2z44&ri=20");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

    }
}