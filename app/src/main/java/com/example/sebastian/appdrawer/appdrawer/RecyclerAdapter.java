package com.example.sebastian.appdrawer.appdrawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sebastian.appdrawer.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Sebastian on 02-11-2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private ArrayList<Ad> arrayList = new ArrayList<Ad>();

    public RecyclerAdapter(ArrayList<Ad> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        Ad ad = arrayList.get(position);
        holder.imageView.setImageResource(ad.getPhotoId());
        holder.title.setText(ad.getTitle());
        holder.creator.setText(ad.getCreator());
        holder.price.setText(ad.getPrice());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title,creator,price;

        public RecyclerViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.img);
            title = (TextView)view.findViewById(R.id.adTitle);
            creator = (TextView)view.findViewById(R.id.adCreator);
            price = (TextView)view.findViewById(R.id.adPrice);
        }
    }
}
