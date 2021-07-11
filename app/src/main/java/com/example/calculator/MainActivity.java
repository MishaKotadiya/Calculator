package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    float mValueOne , mValueTwo;
    boolean crunchifyAddition , mSubtract , crunchifyMultiplication , crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.Button1);
        Button two = (Button) findViewById(R.id.Button2);
        Button three = (Button) findViewById(R.id.Button3);
        Button four = (Button) findViewById(R.id.Button4);
        Button five = (Button) findViewById(R.id.Button5);
        Button six = (Button) findViewById(R.id.Button6);
        Button seven = (Button) findViewById(R.id.Button7);
        Button eight = (Button) findViewById(R.id.Button8);
        Button nine = (Button) findViewById(R.id.Button9);
        Button zero = (Button) findViewById(R.id.Button0);

        Button equal = (Button) findViewById(R.id.ButtonEqual);
        Button C = (Button) findViewById(R.id.ButtonC);
        Button dot = (Button) findViewById(R.id.ButtonDot);

        Button plus = (Button) findViewById(R.id.ButtonPlus);
        Button minus = (Button) findViewById(R.id.ButtonMinus);
        Button Div = (Button) findViewById(R.id.ButtonDivision);
        Button mul = (Button) findViewById(R.id.ButtonStar);

        EditText editText = (EditText) findViewById(R.id.edit);
        TextView textView = (TextView)findViewById(R.id.text);



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
                textView.setText(textView.getText() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
                textView.setText(textView.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
                textView.setText(textView.getText() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
                textView.setText(textView.getText() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
                textView.setText(textView.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
                textView.setText(textView.getText() + "6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
                textView.setText(textView.getText() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
                textView.setText(textView.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
                textView.setText(textView.getText() + "9");

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
                textView.setText(textView.getText() + "0");

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {

                    mValueOne = Float.parseFloat(editText.getText() + "");
                    textView.setText(textView.getText() + "+");
                    crunchifyAddition = true;
                    editText.setText(null);

                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                textView.setText(textView.getText() + "x");
                crunchifyMultiplication = true;
                editText.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                textView.setText(textView.getText() + "-");
                mSubtract = true;
                editText.setText(null);
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                textView.setText(textView.getText() + "÷");
                crunchifyDivision = true;
                editText.setText(null);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
                textView.setText(textView.getText() + ".");
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(" ");
                textView.setText( " ");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueTwo = Float.parseFloat(editText.getText()+"");

                if(crunchifyAddition == true){
                    String add = (mValueOne + mValueTwo) + "";
                    editText.setText(" ");
                    textView.setText(textView.getText() +" = "+ add + " " );
                    crunchifyAddition = false;
                }
                if(mSubtract == true){
                    String add = (mValueOne - mValueTwo) + "";
                    editText.setText(" ");
                    textView.setText(textView.getText() +" = "+ add + " " );
                    mSubtract = false;
                }
                if(crunchifyMultiplication == true){
                    String add = (mValueOne * mValueTwo) + "";
                    editText.setText(" ");
                    textView.setText(textView.getText() +" = "+ add + " " );
                    crunchifyMultiplication = false;
                }
                if(crunchifyDivision == true){
                    String add = (mValueOne / mValueTwo) + "";
                    editText.setText(" ");
                    textView.setText(textView.getText() +" = "+ add + " " );
                    crunchifyDivision = false;
                }
            }
        });


    }

}