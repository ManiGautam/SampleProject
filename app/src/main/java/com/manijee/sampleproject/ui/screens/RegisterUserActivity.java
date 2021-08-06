package com.manijee.sampleproject.ui.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.manijee.sampleproject.R;
import com.manijee.sampleproject.database.Helper;

public class RegisterUserActivity extends AppCompatActivity implements View.OnClickListener {
Button btnregister;
EditText id,contact,password,email;
TextView tv;
Helper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        id=findViewById(R.id.register_edt_userid);
        contact=findViewById(R.id.register_edt_contact);
        password=findViewById(R.id.register_edt_password);
        email=findViewById(R.id.register_edt_email);
        btnregister=findViewById(R.id.register_btnregister);
        btnregister.setOnClickListener(this);
        tv=findViewById(R.id.register_tv_register);
        tv.setOnClickListener(this);
        helper=new Helper(this,"Empdb",null,1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register_btnregister:
                long result=helper.onSave(
                        id.getText().toString(),
                        contact.getText().toString(),
                        email.getText().toString(),
                        password.getText().toString()
                        );
                if(result>0){
                    tv.setVisibility(View.VISIBLE);
                }else{
                    Toast.makeText(this, "Unable to register ! please try again later", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.register_tv_register:
                this.finish();
                break;
        }
    }
}