package com.anchit.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer counter;
    private Integer colorCounter;

    private TextView counterText;
    private Button decreaseButton;
    private Button increaseButton;
    private Button resetButton;

    public void change(View view){

        counter=Integer.parseInt(counterText.getText().toString());

        Button buttonTapped=(Button)view;
        if(buttonTapped==decreaseButton){
            counterText.setText(String.valueOf(counter-1));
        }else if(buttonTapped==increaseButton){
            counterText.setText(String.valueOf(counter+1));
        } else{
            counter=0;
            counterText.setText(String.valueOf(counter));
        }

        colorCounter=Integer.parseInt(counterText.getText().toString());
        if(colorCounter<0){
            counterText.setTextColor(this.getResources().getColor(R.color.red));
        }else if(colorCounter>0){
            counterText.setTextColor(this.getResources().getColor(R.color.green));
        }else{
            counterText.setTextColor(this.getResources().getColor(R.color.purple_500));
        }

        Log.i("tag","Button Tapped");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText=(TextView) findViewById(R.id.counterTextView);
        decreaseButton=(Button) findViewById(R.id.decreaseButton);
        increaseButton=(Button) findViewById(R.id.increaseButton);
        resetButton=(Button)findViewById(R.id.resetButton);

        counterText.setText("0");
    }
}