package com.example.uber.tugas1mopro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by uber on 29/09/16.
 */
public class MainActivity extends AppCompatActivity{

    Button btlogin, btregist, btgmail, btfb, bttwitter;
    EditText etuser, etpass;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btlogin = (Button)findViewById(R.id.btlogin);
        btregist = (Button)findViewById(R.id.btregist);
        btfb = (Button)findViewById(R.id.btfb);
        btgmail = (Button)findViewById(R.id.btgmail);
        bttwitter = (Button)findViewById(R.id.bttwitter);
        etuser = (EditText)findViewById(R.id.etusername);
        etpass = (EditText)findViewById(R.id.etpassword);


        assert btlogin != null;
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etuser.getText().toString().equals("admin") && etpass.getText().toString().equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"Selamat Anda Berhasil Login",Toast.LENGTH_LONG).show();
                    Intent berhasil = new Intent(MainActivity.this, berhasil.class);
                    startActivity(berhasil);

                    etpass.setText("");
                    etpass.setText("");

                }else
                {
                    Toast.makeText(getApplicationContext(),"Username dan Password tidak sesuai",Toast.LENGTH_LONG).show();
                }

            }
        });

        assert btregist != null;
        btregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regist = new Intent(MainActivity.this, regist.class);
                startActivity(regist);
                finish();
            }
        });

        assert btfb != null;
        btfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriFB = Uri.parse("http://www.facebook.com");
                Intent fb = new Intent(Intent.ACTION_VIEW,uriFB);
                startActivity(fb);
                finish();
            }
        });

        assert btgmail != null;
        btgmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriGM = Uri.parse("http://www.gmail.com");
                Intent gmail = new Intent(Intent.ACTION_VIEW,uriGM);
                startActivity(gmail);

            }
        });

        assert bttwitter != null;
        bttwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriTW = Uri.parse("http://www.twitter.com");
                Intent twitter = new Intent(Intent.ACTION_VIEW,uriTW);
                startActivity(twitter);
                finish();
            }
        });

    }
}
