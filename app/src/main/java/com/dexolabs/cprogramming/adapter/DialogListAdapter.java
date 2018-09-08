package com.dexolabs.cprogramming.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dexolabs.cprogramming.R;

import java.util.ArrayList;

/**
 * Created by TOOKAN © 2017. ALL RIGHTS RESERVED.
 */
public class DialogListAdapter extends BaseAdapter {
    private ArrayList<String> array = new ArrayList<>();
    private LayoutInflater mInflater;

    /**
     * constructor for dialog list adapter
     *
     * @param activity the activity
     */
    public DialogListAdapter(final Activity activity) {
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    /**
     * set data
     *
     * @param jobsArrayList the provided list of jobs
     */
    public void setData(final ArrayList<String> jobsArrayList) {
        this.array = jobsArrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(final int position) {
        return position;
    }

    @Override
    public long getItemId(final int position) {
        return position;
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        View item = convertView;
        final ViewHolder viewHolder;
        if (convertView == null) {
            item = mInflater.inflate(R.layout.dailog_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) item.findViewById(R.id.tvName);
            viewHolder.pos = position;
            item.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) item.getTag();
        }
        viewHolder.tvName.setText(array.get(position));
        return item;
    }

    /**
     * View holder class
     */
    private class ViewHolder {
        private TextView tvName;
        private int      pos;
    }
}
