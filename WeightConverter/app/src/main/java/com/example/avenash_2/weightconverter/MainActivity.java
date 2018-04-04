package com.example.avenash_2.weightconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnConvert;
    EditText txtInput;
    EditText txtOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConvert=findViewById(R.id.btnConvert);
        txtInput=findViewById(R.id.txtInput);
        txtOutput=findViewById(R.id.txtOutput);
    }


    public void click(View view) {

        int inputValue = Integer.valueOf(String.valueOf(txtInput.getText()));
        String outputValue=String.valueOf(inputValue*0.453592);
        txtOutput.setText(outputValue);
    }
}
