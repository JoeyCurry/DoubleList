package com.example.doublelist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by jiangjun on 2015/11/21.
 */
public class DoubleListActivity extends Activity {

        private ListView mainlist;
        private ListView morelist;
        private String[] ClassifyMain;
        private String[][] ClassifyMore;
        ClassifyMainAdapter mainAdapter;
        ClassifyMoreAdapter moreAdapter;
        private int get_id;
        private int a = -1;
    private int main_postion = -1;
    private int list_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doublelist_layout);
        initdata();
        initview();
    }

    private void initdata() {
        Bundle bundle = new Bundle();
        bundle = this.getIntent().getExtras();
        get_id = bundle.getInt("id");
        ClassifyMain = getResources().getStringArray(R.array.main);
        ClassifyMore = new String[][] {
                getResources().getStringArray(R.array.more_0),
                getResources().getStringArray(R.array.more_1),
                getResources().getStringArray(R.array.more_2),
                getResources().getStringArray(R.array.more_3),
                getResources().getStringArray(R.array.more_4),
                getResources().getStringArray(R.array.more_5),
                getResources().getStringArray(R.array.more_6),
                getResources().getStringArray(R.array.more_7),
                getResources().getStringArray(R.array.more_8),
                getResources().getStringArray(R.array.more_9),
                getResources().getStringArray(R.array.more_10),
                getResources().getStringArray(R.array.more_11),
                getResources().getStringArray(R.array.more_12),
                getResources().getStringArray(R.array.more_13),
                getResources().getStringArray(R.array.more_14),
                getResources().getStringArray(R.array.more_15),
        };
    }

    private void initview() {
        mainlist = (ListView) findViewById(R.id.classify_mainlist);
        morelist = (ListView) findViewById(R.id.classify_morelist);
        mainAdapter = new ClassifyMainAdapter(DoubleListActivity.this,ClassifyMain,get_id);
        mainAdapter.setSelectItem(get_id);
        mainlist.setAdapter(mainAdapter);
        mainlist.setSelection(get_id - 1);
        mainlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                initAdapter(ClassifyMore[position]);
                mainAdapter.setSelectItem(position);
                mainAdapter.notifyDataSetChanged();
                a = position * 100;
                main_postion = position;
            }
        });
        mainlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        initAdapter(ClassifyMore[get_id]);

        morelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                moreAdapter.setSelectItem(position);
                moreAdapter.notifyDataSetChanged();
                if (a == -1){
                    a = get_id * 100;
                }
                if (main_postion ==  -1){
                    main_postion = get_id;
                }
                list_id = a + position;
                Bundle bundle = new Bundle();
                bundle.putInt("list_id", list_id);
                bundle.putString("list_item", ClassifyMore[main_postion][position]);
                Intent intent = new Intent(DoubleListActivity.this,ResultActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void initAdapter(String[] array) {
        moreAdapter = new ClassifyMoreAdapter(this, array);
        morelist.setAdapter(moreAdapter);
        moreAdapter.notifyDataSetChanged();
    }


}
