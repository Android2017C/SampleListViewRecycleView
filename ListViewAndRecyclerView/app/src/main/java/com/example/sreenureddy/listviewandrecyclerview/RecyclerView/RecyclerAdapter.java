package com.example.sreenureddy.listviewandrecyclerview.RecyclerView;

import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sreenureddy.listviewandrecyclerview.R;

/**
 * Created by kundan on 10/26/2015.
 */
public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

  /*String [] name={"Androidwarriors","Stackoverflow","Developer Android","AndroidHive",
          "Slidenerd","TheNewBoston","Truiton","HmkCode","JavaTpoint","Javapeper"};*/

    private String name[] = {
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

Context context;
    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.recycle_list_iteams, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);

        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setImageResource(imageid[position]);
        holder.imageView.setTag(holder);
        holder.tv1.setTag(holder);




    }



    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();

            Toast.makeText(context,"This is position "+name[position],Toast.LENGTH_LONG ).show();

        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
