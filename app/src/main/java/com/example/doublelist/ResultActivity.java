package com.example.doublelist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jiangjun on 2015/11/21.
 */
public class ResultActivity extends Activity {

    private TextView tv_id,tv_item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);
        tv_id = (TextView) findViewById(R.id.tv_id);
        tv_item = (TextView) findViewById(R.id.tv_item);

        Bundle bundle = new Bundle();
        bundle = this.getIntent().getExtras();
        tv_id.setText(bundle.getInt("list_id") + "");
        tv_item.setText(bundle.getString("list_item"));

    }
}
