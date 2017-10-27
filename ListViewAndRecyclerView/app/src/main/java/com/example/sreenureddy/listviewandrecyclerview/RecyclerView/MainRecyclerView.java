package com.example.sreenureddy.listviewandrecyclerview.RecyclerView;

/**
 * Created by SreenuReddy on 7/10/2016.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sreenureddy.listviewandrecyclerview.R;

public class MainRecyclerView extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_main);

        recyclerView= (RecyclerView) findViewById(R.id.my_recycler_view);

        RecyclerAdapter adapter=new RecyclerAdapter(this);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
