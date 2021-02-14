package com.example.srhr_client;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LSAdapter extends RecyclerView.Adapter<LSAdapter.ViewHolder> {
    List<String>options;

    public LSAdapter(List<String> options) {
        this.options = options;
    }

    @NonNull
    @Override
    public LSAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.lsitem,parent,false);
        LSAdapter.ViewHolder viewHolder = new LSAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LSAdapter.ViewHolder holder, int position) {
        holder.button.setText(options.get(position));
    }

    @Override
    public int getItemCount() {
        return options.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            button = itemView.findViewById(R.id.item_btn);
        }
    }
}
