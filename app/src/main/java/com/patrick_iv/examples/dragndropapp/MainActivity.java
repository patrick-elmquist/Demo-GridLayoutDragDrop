package com.patrick_iv.examples.dragndropapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final int NBR_ITEMS = 9;
    private GridLayout mGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGrid = (GridLayout) findViewById(R.id.grid_layout);

        final LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < NBR_ITEMS; i++) {
            final View itemView = inflater.inflate(R.layout.grid_item, mGrid, false);
            final TextView text = (TextView) itemView.findViewById(R.id.text);
            text.setText(String.valueOf(i + 1));
            mGrid.addView(itemView);
        }
    }
}
