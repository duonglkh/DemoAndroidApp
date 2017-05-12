package com.example.windows7.demoandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnChuyen;
    EditText userName, pass;
    String txtUser, txtPass, checkUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        checkUser = "Duong";

        userName = (EditText) findViewById(R.id.userName);

        btnChuyen = (Button) findViewById(R.id.btnChuyen);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtUser = String.valueOf(userName.getText());
                if (txtUser == null || txtUser.isEmpty()) {
                    Toast.makeText(getApplication(), "Mời nhập Username", Toast.LENGTH_LONG).show();
                }else {
                    final boolean check = checkUser.equals(txtUser);
                    if(check){
                        Toast.makeText(getApplication(), "Login", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(i);
                    }else {
                        Toast.makeText(getApplication(), "That bai", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}
