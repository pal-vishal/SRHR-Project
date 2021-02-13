package com.example.srhr_client;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FaqAdapter extends RecyclerView.Adapter<FaqAdapter.ViewHolder> {
    List<String>faqlist;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.faqitem,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.button.setText(faqlist.get(position));

    }

    @Override
    public int getItemCount() {
        return faqlist.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            button = itemView.findViewById(R.id.item_btn);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //TODO:Onlick waala switch case dekhna
        }
    }
}
