package com.milhamr.amikomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    String msg = "Amikom App :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText usr =(EditText)findViewById(R.id.usr);
        final EditText pwd =(EditText)findViewById(R.id.pwd);
        Button login =(Button) findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.util.Log.d("--AmikomApp--",usr.getText().toString());
                android.util.Log.d("--AmikomApp--",pwd.getText().toString());
            }
        });
    }
}
