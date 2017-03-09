package com.example.user.work1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        ButtonListener bl = new ButtonListener();
        b1.setOnClickListener(bl);
        b2.setOnClickListener(bl);
        b3.setOnClickListener(bl);
        b4.setOnClickListener(bl);
        b5.setOnClickListener(bl);

    }

    private class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent;
            switch(v.getId()){
                case R.id.b1:
                    intent = new Intent(StartActivity.this,MainActivity.class);
                    startActivity(intent);
                    break;

                case R.id.b2:
                    intent = new Intent(StartActivity.this,MainActivity2.class);
                    startActivity(intent);
                    break;

                case R.id.b3:
                    intent = new Intent(StartActivity.this,MainActivity3.class);
                    startActivity(intent);
                    break;

                case R.id.b4:
                    intent = new Intent(StartActivity.this,MainActivity4.class);
                    startActivity(intent);
                    break;

                case R.id.b5:
                    intent = new Intent(StartActivity.this,MainActivity5.class);
                    startActivity(intent);
                    break;
            }

        }
    }


}
