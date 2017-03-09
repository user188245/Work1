package com.example.user.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.init();


    }
    private void init(){
        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new bListener1());
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
    }



private class bListener1 implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        int result = Integer.parseInt(s1) * Integer.parseInt(s2);
        Toast.makeText(getApplicationContext(),"사과의 가격은 " + result + "입니다." , Toast.LENGTH_SHORT).show();
    }
}
}
