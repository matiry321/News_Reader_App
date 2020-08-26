package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter_class extends RecyclerView.Adapter<Adapter_class.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_layout,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView newstitle,author,newsitem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            newstitle =itemView.findViewById(R.id.newstitle);
            author = itemView.findViewById(R.id.author);
            newsitem = itemView.findViewById(R.id.newsitem);
        }
    }
}
