package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView zyme1;
   TextView zyme2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zyme1 = (TextView)findViewById(R.id.textView);
        zyme2 = (TextView)findViewById(R.id.textView2);
    }

    public void m1Click (View v){
        String txt = zyme1.getText().toString();
        double sk = Double.parseDouble(txt);
        sk=sk+5;
        zyme2.setText(Double.toString(sk));
    }
}
