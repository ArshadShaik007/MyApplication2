package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected TextView textView;
    protected EditText editText;
    protected Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextPhone);
        button.setOnClickListener(view -> {
            String x=editText.getText().toString();
            if(x.isEmpty()){
                textView.setText(R.string.empty);
            }
            else {
            int i=Integer.parseInt(x);
            for (int j=1;j<11;j++) {
                String buffer = String.valueOf(i * j);
                textView.append("\n" + i + " x " + j + " = " + buffer);
            }
            }
        });
    }
}