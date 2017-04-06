package com.fdo.prasanga.mysql2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText name, surname, age, username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText)findViewById(R.id.et_latitude);
        surname = (EditText) findViewById(R.id.et_longitude);
    }
    public void onReg(View view){
        String str_lat =name.getText().toString();
        String  str_long =surname.getText().toString();
        String type = "insert";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_lat, str_long);
    }
}
