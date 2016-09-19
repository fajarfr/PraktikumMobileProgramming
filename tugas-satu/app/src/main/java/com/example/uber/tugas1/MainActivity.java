package com.example.uber.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView nama, email, nim, angkatan;
    EditText etnama, etemail, etnim, etangkatan;
    Button btntampil;
    String inama, iemail, inim, iangkatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (TextView) findViewById(R.id.tv2);
        email = (TextView) findViewById(R.id.tv3);
        nim = (TextView) findViewById(R.id.tv4);
        angkatan = (TextView) findViewById(R.id.tv5);

        etnama = (EditText) findViewById(R.id.et_nama);
        etemail = (EditText) findViewById(R.id.et_email);
        etnim = (EditText) findViewById(R.id.et_nim);
        etangkatan = (EditText) findViewById(R.id.et_angkatan);

        btntampil = (Button) findViewById(R.id.bt1);
        assert btntampil != null;

        btntampil.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        inama = etnama.getText().toString();
        iemail = etemail.getText().toString();
        inim = etnim.getText().toString();
        iangkatan = etangkatan.getText().toString();

        nama.setText("Nama: " + inama + "\n");
        email.setText("Email: " + iemail + "\n");
        nim.setText("NIM: " + inim + "\n");
        angkatan.setText("Angkatan: " + iangkatan + "\n");

        etnama.setVisibility(View.GONE);
        etemail.setVisibility(View.GONE);
        etnim.setVisibility(View.GONE);
        etangkatan.setVisibility(View.GONE);

        btntampil.setVisibility(View.GONE);

    }

}
