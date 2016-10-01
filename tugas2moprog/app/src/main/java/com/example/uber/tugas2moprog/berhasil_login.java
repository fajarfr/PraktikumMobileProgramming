package com.example.uber.tugas2moprog;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by uber on 01/10/16.
 */
public class berhasil_login extends AppCompatActivity {

    Button btnlogout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_berhasil);

        btnlogout = (Button)findViewById(R.id.btnlogout);

        assert btnlogout != null;
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(berhasil_login.this, MainActivity.class);
                startActivity(logout);
            }
        });
    }
}
