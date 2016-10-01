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
public class berhasil_regist extends AppCompatActivity {

    Button btncancel, btnRegister1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_regist);

        btnRegister1 = (Button)findViewById(R.id.btnRegister1);
        btncancel = (Button)findViewById(R.id.btnCancel);

        assert btnRegister1 != null;
        btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Regsiter1 = new Intent(berhasil_regist.this, berhasil_login.class);
                startActivity(Regsiter1);
            }
        });

        assert btncancel != null;
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancel = new Intent(berhasil_regist.this, MainActivity.class);
                startActivity(cancel);
            }
        });

    }

}
