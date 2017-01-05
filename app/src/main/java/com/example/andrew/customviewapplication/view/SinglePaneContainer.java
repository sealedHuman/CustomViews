package com.example.andrew.customviewapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.example.andrew.customviewapplication.Container;
import com.example.andrew.customviewapplication.R;
import com.example.andrew.customviewapplication.model.Item;
import com.example.andrew.customviewapplication.model.ItemAdapter;

import java.util.ArrayList;

/**
 * Created by Andrew McAuliffe on 12/12/16.
 */

public class SinglePaneContainer extends FrameLayout implements Container {
    private ItemListView listView;
    private Context context;

    public SinglePaneContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        listView = (ItemListView) getChildAt(0);
        ArrayList<Item> arrayOfItems = new ArrayList<Item>();

        Item item = new Item("Apple", "A company");
        arrayOfItems.add(item);
        item = new Item("Banana", "A company");
        arrayOfItems.add(item);
        item = new Item("Plum", "A company");
        arrayOfItems.add(item);
        item = new Item("Cat", "A company");
        arrayOfItems.add(item);
        item = new Item("Dog", "A company");
        arrayOfItems.add(item);
        item = new Item("Candy", "A company");
        arrayOfItems.add(item);
        item = new Item("Chocolate", "A company");
        arrayOfItems.add(item);
        item = new Item("Google", "A company");
        arrayOfItems.add(item);
        item = new Item("Microsoft", "A company");
        arrayOfItems.add(item);
        item = new Item("Pixar", "A company");
        arrayOfItems.add(item);
        item = new Item("Mad Max", "A company");
        arrayOfItems.add(item);
        item = new Item("ISCS", "A company");
        arrayOfItems.add(item);
        item = new Item("Regions", "A company");
        arrayOfItems.add(item);
        item = new Item("Papa Johns", "A company");
        arrayOfItems.add(item);
        item = new Item("NFL", "A company");
        arrayOfItems.add(item);
        item = new Item("NBA", "A company");
        arrayOfItems.add(item);
        item = new Item("Golf", "A company");
        arrayOfItems.add(item);
        item = new Item("Whiskey", "A company");
        arrayOfItems.add(item);
        item = new Item("Tango", "A company");
        arrayOfItems.add(item);
        item = new Item("Foxtrot", "A company");
        arrayOfItems.add(item);

        ItemAdapter itemAdapter = new ItemAdapter(context, arrayOfItems);
        listView.setAdapter(itemAdapter);
    }

    public boolean onBackPressed() {
        if (!listViewAttached()) {
            removeViewAt(0);
            addView(listView);
            return true;
        }
        return false;
    }

    @Override
    public void showItem(String item) {
        if (listViewAttached()) {
            removeViewAt(0);
            View.inflate(getContext(), R.layout.detail, this);
        }
        MyDetailView detailView = (MyDetailView) getChildAt(0);
        detailView.setItem(item);
    }

    private boolean listViewAttached() {
        return listView.getParent() != null;
    }
}
