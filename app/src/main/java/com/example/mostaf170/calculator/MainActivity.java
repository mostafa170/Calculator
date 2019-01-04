package com.example.mostaf170.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ResText;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ResText=(TextView)findViewById(R.id.showres);

        button1=(Button)findViewById(R.id.b1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button one=(Button) v;
                ResText.setText(one.getText());
            }
        });

        button2=(Button)findViewById(R.id.b2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button two=(Button) v;
                ResText.setText(two.getText());
            }
        });

        button3=(Button)findViewById(R.id.b3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button three=(Button) v;
                ResText.setText(three.getText());
            }
        });

        button4=(Button)findViewById(R.id.b4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button one=(Button) v;
                ResText.setText(one.getText());
            }
        });

        button5=(Button)findViewById(R.id.b5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button one=(Button) v;
                ResText.setText(one.getText());
            }
        });

        button6=(Button)findViewById(R.id.b6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button one=(Button) v;
                ResText.setText(one.getText());
            }
        });

        button7=(Button)findViewById(R.id.b7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button one=(Button) v;
                ResText.setText(one.getText());
            }
        });

        button8=(Button)findViewById(R.id.b8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button one=(Button) v;
                ResText.setText(one.getText());
            }
        });

        button9=(Button)findViewById(R.id.b9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button one=(Button) v;
                ResText.setText(one.getText());
            }
        });

        button0=(Button)findViewById(R.id.b0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button one=(Button) v;
                ResText.setText(one.getText());
            }
        });


    }

    /*public void getNum(View view)
    {
      Button button=(Button) view;
        ResText.setText(button.getText());
    }*/
}
