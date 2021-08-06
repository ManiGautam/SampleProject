package com.manijee.sampleproject.ui.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.manijee.sampleproject.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
EditText id,password;
Button btnlogin;
TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        id=findViewById(R.id.edt_userid);
        password=findViewById(R.id.edt_password);
        btnlogin=findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(this);
        register=findViewById(R.id.tv_register);
        register.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:
                //match id and password and when it is success
                Intent gotohome=new Intent(this,HomeActivity.class);
                startActivity(gotohome);

                break;
            case  R.id.tv_register:
                Intent callregister=new Intent(this,RegisterUserActivity.class);
                startActivity(callregister);
                break;

        }
    }
}