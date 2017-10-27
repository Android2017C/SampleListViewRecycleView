package com.example.sreenureddy.listviewandrecyclerview.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sreenureddy.listviewandrecyclerview.R;

/**
 * Created by kundan on 10/26/2015.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv1,tv2;
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.list_title);

        imageView= (ImageView) itemView.findViewById(R.id.list_avatar);

    }
}
