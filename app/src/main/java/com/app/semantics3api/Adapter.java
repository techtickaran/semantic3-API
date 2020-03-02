
package com.app.semantics3api;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private ArrayList<ResultsItem> modelArrayList = new ArrayList<>();
    Context context;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public AppCompatImageView image;
        public AppCompatTextView ItemName;
        public AppCompatTextView ItemDesc;

        public AppCompatTextView ItemPrice;

        public MyViewHolder(View view) {
            super(view);
            ItemName = (AppCompatTextView) view.findViewById(R.id.ItemName);
            ItemDesc = (AppCompatTextView) view.findViewById(R.id.ItemDesc);
            ItemPrice = (AppCompatTextView) view.findViewById(R.id.ItemPrice);
            image = (AppCompatImageView) view.findViewById(R.id.image);

        }
    }


    public Adapter(ArrayList<ResultsItem> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_searched, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ResultsItem resultsItem = modelArrayList.get(position);
        holder.ItemName.setText(resultsItem.getName());
        holder.ItemDesc.setText("resultsItem.getDescription()");
        holder.ItemPrice.setText("USD "+resultsItem.getPrice());
        Log.e("images",""+resultsItem.getImages());
        Glide.with(context)
                .load(resultsItem.getImages())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }
}