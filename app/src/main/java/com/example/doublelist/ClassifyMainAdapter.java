package com.example.doublelist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by jiangjun on 2015/11/21.
 */
public class ClassifyMainAdapter extends BaseAdapter {

    private Context context;
    private String[] list;
    private int position;
    Holder hold;

    public ClassifyMainAdapter(Context context, String[] list,int position) {
        this.context = context;
        this.list = list;
        this.position = position;
    }


    public int getCount() {
        return list.length;
    }

    public Object getItem(int position) {
        return list[position];
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int arg0, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = View.inflate(context, R.layout.item_classify_mainlist, null);
            hold = new Holder(view);
            view.setTag(hold);
        } else {
            hold = (Holder) view.getTag();
        }
        hold.txt.setText(list[arg0].toString());
        hold.layout.setBackgroundColor(0xFFEBEBEB);
        if (arg0 == position) {
            hold.layout.setBackgroundColor(0xFFFFFFFF);
        }
        return view;
    }

    public void setSelectItem(int position) {
        this.position = position;
    }

    public int getSelectItem() {
        return position;
    }

    private static class Holder {
        LinearLayout layout;
        TextView txt;

        public Holder(View view) {
            txt = (TextView) view.findViewById(R.id.tv_main);
            layout = (LinearLayout) view.findViewById(R.id.mainitem_layout);
        }
    }
}

