package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView zyme1;
   TextView zyme2;
   EditText laukas1, laukas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zyme1 = (TextView)findViewById(R.id.textView);
        zyme2 = (TextView)findViewById(R.id.textView2);
        laukas1 = (EditText)findViewById((R.id.editText));
        laukas2 = (EditText)findViewById(R.id.editText2);
    }

    public void m1Click (View v){
        String txt1 = laukas1.getText().toString();
        double sk1 = Double.parseDouble(txt1);
        String txt2 = laukas2.getText().toString();
        double sk2 = Double.parseDouble(txt2);
        double suma = sk1+sk2;
        zyme2.setText(Double.toString(suma));
    }
}
