package com.sudarshan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button plus, minus, into, divide, clean, del, Equal;
    EditText data;
    Float mvalue1, mvalue2;
    Boolean addition, subtraction, mutiplicaton, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        into = (Button) findViewById(R.id.into);
        divide = (Button) findViewById(R.id.divide);
        clean = (Button) findViewById(R.id.clean);
        del = (Button) findViewById(R.id.del);
        Equal = (Button) findViewById(R.id.equal);
        data = (EditText) findViewById(R.id.data);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data == null)
                {
                    data.setText(" ");
                } else
                {
                    mvalue1 = Float.parseFloat(data.getText() + "");
                    addition = true;
                    data.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data == null)
                {
                    data.setText(" ");
                }else
                {
                    mvalue1 = Float.parseFloat(data.getText() + "");
                    subtraction = true;
                    data.setText(null);
                }
            }
        });
        into.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data == null)
                {
                    data.setText(" ");
                }else
                {
                    mvalue1 = Float.parseFloat(data.getText() + "");
                    mutiplicaton = true;
                    data.setText(null);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data == null)
                {
                    data.setText(" ");
                }else
                {
                    mvalue1 = Float.parseFloat(data.getText() + "");
                    division = true;
                    data.setText(null);
                }
            }
        });
        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalue2 = Float.parseFloat(data.getText() + "");
                if (addition == true)
                {
                    data.setText(mvalue1 + mvalue2 + "");
                    addition=false;
                }
                else if (subtraction==true)
                {
                    data.setText(mvalue1 - mvalue2 + "");
                    subtraction=false;
                }
                else if (mutiplicaton==true)
                {
                    data.setText(mvalue1 * mvalue2 + "");
                    mutiplicaton=false;
                }
                else if (division==true)
                {
                    data.setText(mvalue1 / mvalue2 + "");
                    division=false;
                }
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("");
            }
        });

    }
}

