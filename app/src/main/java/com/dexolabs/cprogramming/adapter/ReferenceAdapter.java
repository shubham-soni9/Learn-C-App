package com.dexolabs.cprogramming.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dexolabs.cprogramming.R;

import java.util.ArrayList;

public class ReferenceAdapter extends RecyclerView.Adapter<ReferenceAdapter.ViewHolder> {
    private ArrayList<String> rightsList;

    public ReferenceAdapter(ReferenceAdapter.OnItemListener onItemListener, ArrayList<String> rightsList) {
        this.rightsList = rightsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reference, parent, false);
        return new ReferenceAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        position = holder.getAdapterPosition();

    }

    @Override
    public int getItemCount() {
        return rightsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    public interface OnItemListener {
        void onFleetRightSelected(int value);
    }
}
