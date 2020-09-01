package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_class extends RecyclerView.Adapter<Adapter_class.ViewHolder> {

    private ArrayList<ModelClass> arrayList ;
    private Context context;

    public Adapter_class(ArrayList<ModelClass> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_layout,null);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelClass mc = arrayList.get(position);
        holder.newstitle.setText(mc.getTitle());
        holder.author.setText(mc.getId());
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView newstitle,author;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            newstitle =itemView.findViewById(R.id.newstitle);
            author = itemView.findViewById(R.id.author);

        }
    }
}
