package com.example.uber.tugas1mopro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by uber on 29/09/16.
 */
public class regist extends AppCompatActivity {

    EditText etnama, etemail, etangkatan, etnim;
    Button btncancel, btnregist;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_regist);

        btncancel = (Button)findViewById(R.id.btncancel);
        btnregist = (Button)findViewById(R.id.btnregist);

        assert btncancel != null;
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancel = new Intent(regist.this, MainActivity.class);
                startActivity(cancel);
                finish();
            }
        });

        assert btnregist != null;
        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(regist.this, berhasil.class);
                startActivity(register);
                finish();
            }
        });

    }
}
