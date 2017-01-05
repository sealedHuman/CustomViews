package com.example.andrew.customviewapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.example.andrew.customviewapplication.Container;

/**
 * Created by Andrew McAuliffe on 12/12/16.
 */

public class DualPaneContainer extends LinearLayout implements Container {
    private MyDetailView detailView;

    public DualPaneContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        detailView = (MyDetailView) getChildAt(1);
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override
    public void showItem(String item) {
        detailView.setItem(item);
    }
}
