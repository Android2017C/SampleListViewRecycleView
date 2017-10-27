package com.example.sreenureddy.listviewandrecyclerview.NormalListView;

/**
 * Created by SreenuReddy on 7/8/2016.
 */


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sreenureddy.listviewandrecyclerview.R;


public class AddCustomListView extends AppCompatActivity {

    private ListView listView;
    private String names[] = {
            "Activity",
            "Service",
            "BroadCastReceiver",
            "ContentProvider","INDEX","Android","Java","Sqlite","XML","JSON"
    };




    private Integer imageid[] = {
            R.drawable.ic_launcher,
            R.drawable.icon,
            R.drawable.ic_launcher,
            R.drawable.icon,
            R.drawable.ic_launcher,
            R.drawable.icon,
            R.drawable.ic_launcher,
            R.drawable.icon,
            R.drawable.ic_launcher,
            R.drawable.icon
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_listview);

        CustomListView customList = new CustomListView(this, names, imageid);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You Clicked "+names[i],Toast.LENGTH_SHORT).show();
            }
        });
    }




}
