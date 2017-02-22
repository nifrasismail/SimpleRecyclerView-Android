package com.example.nifras.simplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 100;
    private CustomAdapter mAdapter;
    private RecyclerView mNumberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (15) Referening the recycler view
        mNumberList = (RecyclerView) findViewById(R.id.rv_numbers);

        // TODO )16) Creating the LinearLayout Manager and set it to the recycler view as layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mNumberList.setLayoutManager(layoutManager);

        mNumberList.setHasFixedSize(true);

        mAdapter = new CustomAdapter(NUM_LIST_ITEMS);

        mNumberList.setAdapter(mAdapter);


    }
}
