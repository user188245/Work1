package com.example.user.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        init();
    }

    private void init(){
        setTitle("계산기");
        ButtonListener buttonListener = new ButtonListener();
        (b1 = (Button)findViewById(R.id.b1)).setOnClickListener(buttonListener);
        (b2 = (Button)findViewById(R.id.b2)).setOnClickListener(buttonListener);
        (b3 = (Button)findViewById(R.id.b3)).setOnClickListener(buttonListener);
        (b4 = (Button)findViewById(R.id.b4)).setOnClickListener(buttonListener);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
    }

    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            try {
                int i = Integer.parseInt(e1.getText().toString());
                int j = Integer.parseInt(e2.getText().toString());
                switch (v.getId()) {
                    case R.id.b1:
                        Toast.makeText(getApplicationContext(),"더하기 계산 결과는 " + (i+j) + "입니다.",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b2:
                        Toast.makeText(getApplicationContext(),"빼기 계산 결과는 " + (i-j) + "입니다.",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b3:
                        Toast.makeText(getApplicationContext(),"곱하기 계산 결과는 " + (i*j) + "입니다.",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b4:
                        Toast.makeText(getApplicationContext(),"나누기 계산 결과는 " + ((float)i/(float)j) + "입니다.",Toast.LENGTH_SHORT).show();
                        break;
                }
            }catch(NumberFormatException e){
                if(e1.getText().toString().isEmpty()){
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else if(e2.getText().toString().isEmpty()){
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private int getNum(String s){
        return Integer.parseInt(s);
    }

}
