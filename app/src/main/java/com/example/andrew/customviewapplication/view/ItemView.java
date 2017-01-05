package com.example.andrew.customviewapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.andrew.customviewapplication.R;
import com.example.andrew.customviewapplication.model.Item;

/**
 * Created by Andrew McAuliffe on 1/4/17.
 */

public class ItemView extends RelativeLayout {
    private TextView nameTextView;
    private TextView descriptionTextView;

    public ItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemView(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);
        LayoutInflater.from(context).inflate(R.layout.item_view_children, this, true);
        setupChildren();
    }

    private void setupChildren() {
        nameTextView = (TextView) findViewById(R.id.item_nameTextView);
        descriptionTextView = (TextView) findViewById(R.id.item_descriptionTextView);
    }

    public void setItem(Item item) {
        nameTextView.setText(item.getName());
        descriptionTextView.setText(item.getDescription());
    }

    public static ItemView inflate(ViewGroup parent) {
        ItemView itemView = (ItemView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return itemView;
    }
}
