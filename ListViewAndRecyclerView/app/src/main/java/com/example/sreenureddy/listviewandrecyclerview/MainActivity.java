package com.example.sreenureddy.listviewandrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sreenureddy.listviewandrecyclerview.NormalListView.AddCustomListView;
import com.example.sreenureddy.listviewandrecyclerview.RecyclerView.MainRecyclerView;

public class MainActivity extends AppCompatActivity {

    Button listnormal,recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listnormal=(Button)findViewById(R.id.list);
        recycler=(Button)findViewById(R.id.recy);

        listnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             Intent list=new Intent(getApplicationContext(), AddCustomListView.class);
                startActivity(list);

            }
        });

        recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recy=new Intent(getApplicationContext(), MainRecyclerView.class);
                startActivity(recy);


            }
        });
    }
}
