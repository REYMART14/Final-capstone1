package com.example.pestgon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    Context context;
    ArrayList<Integer> arrayList;
    LayoutInflater layoutInflater;
    public ListAdapter(Context context, ArrayList<Integer>arrayList){
        this.context=context;
        this.arrayList=arrayList;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View view2 = layoutInflater.inflate(R.layout.mylayout2, null);
        ImageView imageView = view2.findViewById(R.id.image);
        TextView textView = view2.findViewById(R.id.text);
        imageView.setImageResource(arrayList.get(position));
        textView.setText(arrayList.get(position));
        return view2;
    }

}