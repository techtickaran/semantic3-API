
package com.app.semantics3api;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ProductDialogAdapter extends RecyclerView.Adapter<ProductDialogAdapter.MyViewHolder> {

    Context context;
    ArrayList<SitedetailsItem> resultsItem;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public AppCompatTextView Itemname;
        public MyViewHolder(View view) {
            super(view);
            Itemname = (AppCompatTextView) view.findViewById(R.id.txt_name);
        }
    }
    public ProductDialogAdapter(Context context, ArrayList<SitedetailsItem> resultsItem) {
        this.context = context;
        this.resultsItem = resultsItem;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product_dialog, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Itemname.setText(resultsItem.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return resultsItem.size();
    }
}