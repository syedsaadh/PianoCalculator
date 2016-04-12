package com.example.materialcalculator;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float prevValue=0,newValue=0;
    boolean addFunc , subFunc ,mulFunc ,divFunc  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttondot = (Button) findViewById(R.id.buttonDot);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonSub = (Button) findViewById(R.id.buttonSub);
        Button buttonMul = (Button) findViewById(R.id.buttonMul);
        Button buttonDivision = (Button) findViewById(R.id.buttonDiv);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        Button buttonEqual = (Button) findViewById(R.id.buttonEqual);
        final TextView outputText = (TextView) findViewById(R.id.outputText);


        button0.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.a2b3);

            public void onClick(View v) {
                outputText.setText(outputText.getText()+"0");
               if (mp.isPlaying()== true) {
                   mp.start();
               }
                mp.start();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.b2b3);

            public void onClick(View v) {
                outputText.setText(outputText.getText()+"1");
                mp.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.c2b3);

            public void onClick(View v) {
                outputText.setText(outputText.getText()+"2");
                mp.start();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.d2b3);
            public void onClick(View v) {
                outputText.setText(outputText.getText()+"3");
                mp.start();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.e2b3);
            public void onClick(View v) {
                outputText.setText(outputText.getText()+"4");
                mp.start();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.f2b3);
            public void onClick(View v) {
                outputText.setText(outputText.getText()+"5");
                mp.start();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.g2b3);
            public void onClick(View v) {
                outputText.setText(outputText.getText()+"6");
                mp.start();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.a2b3);
            public void onClick(View v) {
                outputText.setText(outputText.getText()+"7");
                mp.start();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.b2b3);
            public void onClick(View v) {
                outputText.setText(outputText.getText()+"8");
                mp.start();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.c2b3);
            public void onClick(View v) {
                outputText.setText(outputText.getText()+"9");
                mp.start();
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.d2b3);
            public void onClick(View v) {
                outputText.setText(outputText.getText()+".");
                mp.start();
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.e2b3);

            public void onClick(View v) {
                outputText.setText("");
                mp.start();
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (outputText == null){
                    outputText.setText("");
                }else {
                    prevValue = Float.parseFloat(outputText.getText() + "");
                   addFunc= true;
                    outputText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (outputText == null){
                    outputText.setText("");
                }else {
                    prevValue = Float.parseFloat(outputText.getText() + "");
                    subFunc = true;
                    outputText.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (outputText == null){
                    outputText.setText("");
                }else {
                    prevValue = Float.parseFloat(outputText.getText() + "");
                   divFunc = true;
                    outputText.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (outputText == null) {
                    outputText.setText("");
                } else {
                    prevValue = Float.parseFloat(outputText.getText() + "");
                    mulFunc = true;
                    outputText.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newValue = Float.parseFloat(outputText.getText() + "");

                if (addFunc == true){

                    outputText.setText(prevValue + newValue + "");
                    addFunc =false;
                }


                if (subFunc == true){

                    outputText.setText(prevValue - newValue +"");
                   subFunc = false;
                }

                if (mulFunc == true){

                    outputText.setText(prevValue * newValue +"");
                    mulFunc=false;
                }

                if (divFunc == true){

                    outputText.setText(prevValue / newValue +"");
                   divFunc=false;
                }
            }
        });


    }

}
