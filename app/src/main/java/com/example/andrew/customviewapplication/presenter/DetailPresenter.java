package com.example.andrew.customviewapplication.presenter;

import android.view.View;
import android.widget.Toast;

import com.example.andrew.customviewapplication.view.MyDetailView;

/**
 * Created by Andrew McAuliffe on 12/12/16.
 */

public class DetailPresenter {

    private MyDetailView view;

    public DetailPresenter() {

    }

    public MyDetailView getView() {
        return view;
    }

    public void setView(MyDetailView view) {
        this.view = view;
    }

    public void okButtonClicked() {
        Toast.makeText(view.getContext(), "OK Clicked!", Toast.LENGTH_SHORT).show();
        MyDetailView view = getView();
    }
}
