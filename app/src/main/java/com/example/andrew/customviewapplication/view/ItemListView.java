package com.example.andrew.customviewapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.andrew.customviewapplication.Container;
import com.example.andrew.customviewapplication.MainActivity;
import com.example.andrew.customviewapplication.R;

/**
 * Created by Andrew McAuliffe on 12/12/16.
 */

public class ItemListView extends ListView {

    public ItemListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String[] fruitArray = getResources().getStringArray(R.array.fruit_array);
                MainActivity activity = (MainActivity) getContext();
                Container container = activity.getContainer();
                container.showItem(fruitArray[i]);
            }
        });
    }
}
