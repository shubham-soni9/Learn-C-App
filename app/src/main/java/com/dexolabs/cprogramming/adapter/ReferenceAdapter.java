package com.dexolabs.cprogramming.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexolabs.cprogramming.R;

import java.util.LinkedHashMap;

public class ReferenceAdapter extends RecyclerView.Adapter<ReferenceAdapter.ViewHolder> {
    private LinkedHashMap<String, String> referenceList;
    private String[]                      referenceTitleList;

    public ReferenceAdapter(LinkedHashMap<String, String> referenceList) {
        this.referenceList = referenceList;
        this.referenceTitleList = referenceList.keySet().toArray(new String[referenceList.size()]);
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
        holder.tvReferenceName.setText(referenceTitleList[position].trim());
        holder.tvReferenceDescription.setText(referenceList.get(referenceTitleList[position]));
    }

    @Override
    public int getItemCount() {
        return referenceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvReferenceName;
        private TextView tvReferenceDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            tvReferenceName = itemView.findViewById(R.id.tvReferenceName);
            tvReferenceDescription = itemView.findViewById(R.id.tvReferenceDescription);
        }
    }

    public interface OnItemListener {
        void onFleetRightSelected(int value);
    }
}
