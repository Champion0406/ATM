package com.champion.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {
    private EditText edNickname;
    private EditText edPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        edNickname = (EditText) findViewById(R.id.user_nickname);
        edPhone = (EditText) findViewById(R.id.user_phone);
        String edname = getSharedPreferences("info",MODE_PRIVATE)
                .getString("NAME","");
        String edphone = getSharedPreferences("info",MODE_PRIVATE)
                .getString("PHONE","");
        edNickname.setText(edname);
        edPhone.setText(edphone);
        }
        public  void ok(View view){
            String nickname = edNickname.getText().toString();
            String phone = edPhone.getText().toString();
            getIntent().putExtra("EXTRA_NICKNAME",nickname);
            getIntent().putExtra("EXTRA_PHONE",phone);
            setResult(RESULT_OK,getIntent());
            finish();
        }
    }

