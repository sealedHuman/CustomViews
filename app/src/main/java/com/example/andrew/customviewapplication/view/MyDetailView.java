package com.example.andrew.customviewapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.andrew.customviewapplication.R;
import com.example.andrew.customviewapplication.presenter.DetailPresenter;

/**
 * Created by Andrew McAuliffe on 12/12/16.
 */

public class MyDetailView extends LinearLayout {
    TextView textView;
    DetailPresenter presenter;

    public MyDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        presenter = new DetailPresenter();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        presenter.setView(this);
        textView = (TextView) findViewById(R.id.text);
        findViewById(R.id.ok).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.okButtonClicked();
            }
        });
    }

    public void setItem(String item) {
        textView.setText(item);
    }
}
