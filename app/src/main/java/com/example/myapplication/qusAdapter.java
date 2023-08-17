package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class qusAdapter extends BaseAdapter{
    private Context context;
    ArrayList<qus> items;

    public qusAdapter(Context context,ArrayList<qus> items) {
        this.context = context;
        this.items = items;
    }



    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
          convertView = LayoutInflater.from(context).inflate(R.layout.view1, parent, false);
        }

        TextView titleTextView = convertView.findViewById(R.id.Txt);


        qus post = (qus) getItem(position);

        titleTextView.setText(post.getqus());




        return convertView;
    }
}