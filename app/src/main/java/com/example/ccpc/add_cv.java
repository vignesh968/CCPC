package com.example.ccpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class add_cv extends AppCompatActivity {
public Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cv);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiSraX82Zr2AhVTKXIKHUotDFIYABAAGgJzZg&ae=2&dsh=1&agsac=8Q7sDCdRAW4&cit=CkQKCAiAmeKQBhBIEjQAKzFomPbUnXPxxQuu57_6crgjgqOcWIL-Lb8XHEK68cuSIPuvyPFBHZcikAT5xkrvggWdGgI8AvD_BwE&ei=E7cYYujPJree4-EPxJ2bsAM&ohost=www.google.com&cid=CAESVuD26JgMhNKwI0z1x2Li7VEl9ecvR6euXfypKFE9A9bdGIt9iG5T6jIEI0Z5GJTcHlyhyR9pVRzxrHhkuzdXu7oQXtAUCpHMQl_Vk9KaA-D99L-_u9Cd&sig=AOD64_0xN8aa_N1t5V9aCERoPCDEEkeUyA&q&sqi=2&adurl&ved=2ahUKEwiopZ382Zr2AhU3zzgGHcTOBjYQ0Qx6BAgBEAE&ms=CoACZatyTxn9H6BzrUDGqyfMsqwOhYJTm-gZzpmGjeVqTOknqE0B2tPFMeZlD-QWALMmGO_dCyk3Q15R32pA6i06kWL-vxAo-6t02Cltg5S5uV0iNyIMxDud2itxjlOvHxXrj3HEHc7ZbLRVyck0HGLPIbnlDHqs9cB6vRGRwXvjpNPX84iVOqdRcNhVjimSY3C4hD8Gf4BFPGlgutrygOfB3XuykowO0mKtDzME0zgeLpmlDwOhJfqf5VzkruY-Bn6suJJi-84rCAYejqhmYgwlkKzRFY_JmgL62iSXjwyDelxcIui6I1-uVfah8Ts-G7i3hC-KPWZ4D8xpJInzi42KHAqAAn92qoO1xfVfIJ6VZ5BaCYIFalDZoKBrio5jxLJPR9iAKDkP08O82fJdCB-mDl11RDZxOd_aR9luwD0rVP3tHAPhEMLsjPYO1QiPFKEFsIbh5EHKHmY7dUoD9T92NhKIFl2VYkFiuJZHLy5o114FR-kmmQ9jNjmY_pzd1TDBV-qyLgQ9EoWc6nQCrzl1KUoPjcsL1NYL2RNDnfUOqigF_lKSZFvFdd2vRZemlWBN8OHu86r_kese19Tbn0hmj2a5y8tLLmSXCRoWve9iAzac0jcdQrvg-ltoXKMJMqxzlohSyzw4k8L8ZHaJVNjkQn-MG5LpkINeiYn_fx8oH-p3qMsSEKIItBHRrtBHb8pyTM1Mkco&dct=1");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri =Uri.parse("https://altresume.com/?gclidhttps://www.launchmycareer.com/?utm_source=google&utm_medium=cpc&utm_campaign=&utm_adgroup=&utm_term=best%20career%20counsellor%20online&gclid=Cj0KCQiAmeKQBhDvARIsAHJ7mF49_1ulzR4gE_j2ccUe2Kv1sjEKZEvpHeJjGWqzzo7dY7UNPdjP5pQaAhKLEALw_wcB=Cj0KCQiAmeKQBhDvARIsAHJ7mF4iGmic9iLMRRPQIcsx4gf-bapzwtbfXkUzE9yDxYJQzCKoHd3r_tgaAqK7EALw_wcB");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}