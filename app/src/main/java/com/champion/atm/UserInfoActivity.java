package com.champion.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    private static final String TAG = "";
    private EditText edNickname;
    private EditText edPhone;
    private Spinner ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ages = (Spinner) findViewById(R.id.ages);
        ArrayList<String> data = new ArrayList<>();
        //  for (int i = 15;i<=40;i++){
        //      data.add(i+"");
        //  }
        //  String[] data = getResources().getStringArray(R.array.ages);
        ArrayAdapter adapter = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1, data);
        ages.setAdapter(adapter);

        edNickname = (EditText) findViewById(R.id.user_nickname);
        edPhone = (EditText) findViewById(R.id.user_phone);
        String edname = getSharedPreferences("info", MODE_PRIVATE)
                .getString("NAME", "");
        String edphone = getSharedPreferences("info", MODE_PRIVATE)
                .getString("PHONE", "");
        edNickname.setText(edname);
        edPhone.setText(edphone);
    }
    public  void addr(View view){
        startActivity(new Intent(this,CityActivity.class));
    }

    public void ok(View view) {
        Log.d(TAG, "ok:" + ages.getSelectedItem().toString());
        int age = Integer.parseInt(ages.getSelectedItem().toString());
        String nickname = edNickname.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("EXTRA_NICKNAME", nickname);
        getIntent().putExtra("EXTRA_PHONE", phone);
        setResult(RESULT_OK, getIntent());
        finish();
    }

}

