package com.example.user.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    EditText e1,e2,e3;
    CheckBox c1;
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        init();
    }

    private void init(){
        setTitle("레스토랑 메뉴 주문");
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        c1 = (CheckBox)findViewById(R.id.c1);
        b1 = (Button)findViewById(R.id.b1);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        b1.setOnClickListener(new ButtonListener());

    }

    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int i1,i2,i3,num,sum;
            i1 = getNum(e1.getText().toString());
            i2 = getNum(e2.getText().toString());
            i3 = getNum(e3.getText().toString());
            num = i1 + i2 + i3;
            sum = i1 * 15000 + i2 * 13000 + i3 * 9000;
            if(c1.isChecked())
                sum = (int)(sum * 0.9);
            t1.setText(num + "개");
            t2.setText(sum + "원");
        }
    }

    private int getNum(String s){
        try{
            return s.equals("")?0:Integer.parseInt(s);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
