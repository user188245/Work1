package com.example.user.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
    }

    private void init(){
        b1 = (Button)findViewById(R.id.b1);
            b2 = (Button)findViewById(R.id.b2);
            e1 = (EditText)findViewById(R.id.e1);
            e2 = (EditText)findViewById(R.id.e2);
            b1.setOnClickListener(new MainActivity3.ButtonListener1());
            b2.setOnClickListener(new MainActivity3.ButtonListener2());
        }

        private class ButtonListener1 implements View.OnClickListener{
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(e1.getText().toString())*1.8 + 32;
                Toast.makeText(getApplicationContext(),"화씨 온도는 " + temp + "도 입니다.", Toast.LENGTH_SHORT);
            }
        }
        private class ButtonListener2 implements View.OnClickListener{
            @Override
            public void onClick(View v) {
            double temp = (Double.parseDouble(e2.getText().toString()) - 32)/1.8;
            Toast.makeText(getApplicationContext(),"섭씨 온도는 " + temp + "도 입니다.", Toast.LENGTH_SHORT);
        }
    }
}
