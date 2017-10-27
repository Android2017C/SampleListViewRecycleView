package com.example.sreenureddy.listviewandrecyclerview.NormalListView;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sreenureddy.listviewandrecyclerview.R;


/**
 * Created by SreenuReddy on 7/8/2016.
 */


public class CustomListView extends ArrayAdapter<String> {
    private String[] names;

    private Integer[] imageid;
    private Activity context;

    public CustomListView(Activity context, String[] names,  Integer[] imageid) {
        super(context, R.layout.normal_listview_items, names);
        this.context = context;
        this.names = names;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.normal_listview_items, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);

        textViewName.setText(names[position]);
        image.setImageResource(imageid[position]);
        return  listViewItem;
    }
}
