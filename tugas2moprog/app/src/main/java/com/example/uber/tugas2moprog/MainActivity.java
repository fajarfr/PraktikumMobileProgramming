package com.example.uber.tugas2moprog;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnlogin, btnRegister, btfb, btgmail, bttwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btfb = (Button) findViewById(R.id.button3);
        btgmail = (Button) findViewById(R.id.button4);
        bttwitter = (Button) findViewById(R.id.button5);

        assert btnlogin != null;
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG);
                    Intent loginsukses = new Intent(MainActivity.this, berhasil_login.class);
                    startActivity(loginsukses);

                } else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });


        assert btnRegister != null;
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regist = new Intent(MainActivity.this, berhasil_regist.class);
                startActivity(regist);
            }
        });

        assert btfb != null;
        btfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriGM = Uri.parse("http://www.facebook.com");
                Intent fb = new Intent(Intent.ACTION_VIEW, uriGM);
                startActivity(fb);
            }
        });

        assert btgmail != null;
        btgmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriGM = Uri.parse("http://www.gmail.com");
                Intent gmail = new Intent(Intent.ACTION_VIEW, uriGM);
                startActivity(gmail);
            }
        });

        assert bttwitter != null;
        bttwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriGM = Uri.parse("http://www.twitter.com");
                Intent twitter = new Intent(Intent.ACTION_VIEW, uriGM);
                startActivity(twitter);
            }
        });

    }
}