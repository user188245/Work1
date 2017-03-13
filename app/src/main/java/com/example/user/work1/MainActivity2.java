package com.example.user.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    private void init(){
        setTitle("나이계산기");
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1.setOnClickListener(new ButtonListener1());
        b2.setOnClickListener(new ButtonListener2());
        }

    private class ButtonListener1 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            int age = 2017 - Integer.parseInt(e1.getText().toString()) + 1;
            Toast.makeText(getApplicationContext(),"당신의 나이는 " + age + " 세 입니다.", Toast.LENGTH_SHORT).show();
        }
    }
    private class ButtonListener2 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            int year = 2017 - Integer.parseInt(e2.getText().toString()) + 1;
            Toast.makeText(getApplicationContext(),"당신이 태어난 연도는 " + year + "년 입니다.", Toast.LENGTH_SHORT).show();
        }
    }
}
