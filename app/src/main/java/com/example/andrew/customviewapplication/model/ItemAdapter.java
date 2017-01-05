package com.example.andrew.customviewapplication.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.andrew.customviewapplication.view.ItemView;

import java.util.List;

/**
 * Created by Andrew McAuliffe on 1/4/17.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, List<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView itemView = (ItemView) convertView;
        if (itemView == null) {
            itemView = ItemView.inflate(parent);
        }
        itemView.setItem(getItem(position));
        return itemView;
    }
}
