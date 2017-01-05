package com.example.andrew.customviewapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Andrew McAuliffe on 12/12/16.
 */

public class MainActivity extends Activity {
    private Container container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        container = (Container) findViewById(R.id.container);
    }

    public Container getContainer() {
        return container;
    }

    @Override
    public void onBackPressed() {
        boolean handled = container.onBackPressed();
        if (!handled) {
            finish();
        }
    }
}
