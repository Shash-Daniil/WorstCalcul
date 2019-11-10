package com.example.calculat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doPlus(View v) {
        EditText number1 = (EditText)(findViewById(R.id.num1));
        EditText number2 = (EditText)(findViewById(R.id.num2));
        TextView resultText = (TextView)(findViewById(R.id.text_result));

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int resultSum = num1 + num2;
        resultText.setText(Integer.toString(resultSum));
    }

    public void doMinus(View v) {
        EditText number1 = (EditText)(findViewById(R.id.num1));
        EditText number2 = (EditText)(findViewById(R.id.num2));
        TextView resultText = (TextView)(findViewById(R.id.text_result));

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int resultSum = num1 - num2;
        resultText.setText(Integer.toString(resultSum));
    }

    public void doDivision(View v) {
        EditText number1 = (EditText)(findViewById(R.id.num1));
        EditText number2 = (EditText)(findViewById(R.id.num2));
        TextView resultText = (TextView)(findViewById(R.id.text_result));
        double num1 = Integer.parseInt(number1.getText().toString());
        double num2 = Integer.parseInt(number2.getText().toString());
        if (num2 != 0) {
            double resultSum = num1 / num2;
            resultText.setText(Double.toString(resultSum));
        }else{
            resultText.setText("Error");
        }
    }

    public void doMultiplication(View v) {
        EditText number1 = (EditText)(findViewById(R.id.num1));
        EditText number2 = (EditText)(findViewById(R.id.num2));
        TextView resultText = (TextView)(findViewById(R.id.text_result));
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int resultSum = num1 * num2;

        resultText.setText(Integer.toString(resultSum));
    }
}
