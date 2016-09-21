package com.accintern.ricardarmankuodis.toomanyactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityA extends LoggingActivity  implements View.OnClickListener{

    private static int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setSubTextViewText(getIntent().getStringExtra("TAG")+" ");
    }

    @Override
    public void on1Clicked(View view) {
        super.on1Clicked(view);
        startActivityWithTag(1,((Button)view).getText()+"");
    }

    @Override
    public void on2Clicked(View view) {
        super.on2Clicked(view);
        startActivityWithTag(2,((Button)view).getText()+"");
    }

    @Override
    public void on3Clicked(View view) {
        super.on3Clicked(view);
        startActivityWithTag(3,((Button)view).getText()+"");
    }

    @Override
    public void on4Clicked(View view) {
        super.on4Clicked(view);
        startActivityWithTag(4,((Button)view).getText()+"");
    }

    @Override
    public void on5Clicked(View view) {
        super.on5Clicked(view);
        startActivityWithTag(-1,((Button)view).getText()+"");
    }

    protected void startActivityWithTag(int tag, String text){
        Intent intent=new Intent(this,ActivityA.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        switch(tag){
            case 1:
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                break;
            case 2:
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                break;
            case 3:
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                Toast.makeText(this, "If set, the activity will not be launched if it is already running at the top of the history stack.", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                break;
        }
        intent.putExtra("TAG",text);
        startActivity(intent);
    }



}
