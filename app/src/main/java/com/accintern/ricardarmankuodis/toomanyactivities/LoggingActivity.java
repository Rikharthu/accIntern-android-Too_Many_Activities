package com.accintern.ricardarmankuodis.toomanyactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ricard.arman.kuodis on 9/21/2016.
 */

public class LoggingActivity extends AppCompatActivity implements View.OnClickListener {
    private static int count=0;
    public static String TAG="Lifecycle ["+count+"]";

    TextView mTextView;
    TextView mSubTextView;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_activity);

        mTextView= (TextView) findViewById(R.id.textView);
        mSubTextView= (TextView) findViewById(R.id.subTextView);
        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        setTextViewText(++count+"");
        TAG="Lifecycle ["+count+"]";
        Log.d(TAG,"onCreate()");


    }

    protected void setTextViewText(String str){
        mTextView.setText(str);
    }

    protected void setSubTextViewText(String str){
        mSubTextView.setText(str);
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onStart()");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        Log.d(TAG,"onBackPressed()");
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause()");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume()");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"onRestart()");
        super.onRestart();
    }

    @Override
    public void onClick(View view) {
        if(view==btn1){
            Log.d("Listener","Click at btn1");
        }else if(view==btn2){
            Log.d("Listener","Click at btn2");
        }else if(view==btn3){
            Log.d("Listener","Click at btn3");
        }else if(view==btn4){
            Log.d("Listener","Click at btn4");
        }
    }

    public void on1Clicked(View view) {
        Log.d("Listener","Click at btn1");
    }
    public void on2Clicked(View view) {
        Log.d("Listener","Click at btn2");
    }
    public void on3Clicked(View view) {
        Log.d("Listener","Click at btn3");
    }
    public void on4Clicked(View view) {
        Log.d("Listener","Click at btn4");
    }
    public void on5Clicked(View view) {
        Log.d("Listener","Click at btn5");
    }



}
