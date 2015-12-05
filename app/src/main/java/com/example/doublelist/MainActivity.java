package com.example.doublelist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener{

    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_10,btn_11,btn_12,btn_13,
           btn_14,btn_15;

    private Bundle bundle = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_10 = (Button) findViewById(R.id.btn_10);
        btn_11 = (Button) findViewById(R.id.btn_11);
        btn_12 = (Button) findViewById(R.id.btn_12);
        btn_13 = (Button) findViewById(R.id.btn_13);
        btn_14 = (Button) findViewById(R.id.btn_14);
        btn_15 = (Button) findViewById(R.id.btn_15);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_10.setOnClickListener(this);
        btn_11.setOnClickListener(this);
        btn_12.setOnClickListener(this);
        btn_13.setOnClickListener(this);
        btn_14.setOnClickListener(this);
        btn_15.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_0:
                bundle.putInt("id",0);
                StartActivity(DoubleListActivity.class,bundle);
                break;
            case R.id.btn_1:
                bundle.putInt("id",1);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_2:
                bundle.putInt("id",2);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_3:
                bundle.putInt("id",3);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_4:
                bundle.putInt("id",4);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_5:
                bundle.putInt("id",5);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_6:
                bundle.putInt("id",6);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_7:
                bundle.putInt("id",7);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_8:
                bundle.putInt("id",8);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_9:
                bundle.putInt("id",9);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_10:
                bundle.putInt("id",10);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_11:
                bundle.putInt("id",11);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_12:
                bundle.putInt("id",12);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_13:
                bundle.putInt("id",13);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_14:
                bundle.putInt("id",14);
                StartActivity(DoubleListActivity.class, bundle);
                break;
            case R.id.btn_15:
                bundle.putInt("id",15);
                StartActivity(DoubleListActivity.class, bundle);
                break;

        }
    }

    private void StartActivity(Class activity, Bundle bundle){
        Intent intent = new Intent(MainActivity.this,activity);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
