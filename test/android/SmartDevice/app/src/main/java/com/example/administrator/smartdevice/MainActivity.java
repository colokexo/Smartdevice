package com.example.administrator.smartdevice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout backGround;
    Button button_On;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        backGround= (LinearLayout)findViewById(R.id.backGrond);
        button_On=(Button)findViewById(R.id.Button_On);
        button_On.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click button code here
                backGround.setBackgroundColor(Color.BLUE);
            }
        });
    }
}
