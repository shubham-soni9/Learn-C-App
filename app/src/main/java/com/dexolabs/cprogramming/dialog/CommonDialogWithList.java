package com.dexolabs.cprogramming.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.dexolabs.cprogramming.R;
import com.dexolabs.cprogramming.adapter.DialogListAdapter;
import com.dexolabs.cprogramming.data.Dependencies;

import java.util.ArrayList;

/**
 * Developer: Saurabh Verma
 * Dated: 04/10/16.
 */

public class CommonDialogWithList {
    private DialogListAdapter       dialogListAdapter;
    private Activity                activity;
    private ListView                dlgPriorityLvw;
    private OnListItemClickListener nnListItemClickListener;
    private static final float DIM_AMOUNT = 0.6f;

    /**
     * @param act
     */
    private CommonDialogWithList(Activity act) {
        activity = act;
    }

    /**
     * @param activity
     * @return
     */
    public static CommonDialogWithList with(Activity activity) {
        return new CommonDialogWithList(activity);
    }

    /**
     * @param arrayList
     */
    public void show(String header, final ArrayList<String> arrayList, OnListItemClickListener listener) {
        try {
            nnListItemClickListener = listener;
            final Dialog dialog = new Dialog(activity);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            dialog.setContentView(R.layout.dialog_with_list);
            WindowManager.LayoutParams layoutParams = dialog.getWindow().getAttributes();
            layoutParams.dimAmount = DIM_AMOUNT;
            dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            TextView textMessage = dialog.findViewById(R.id.textMessage);
            if (header == null || header.isEmpty()) {
                textMessage.setVisibility(View.GONE);
            } else {
                textMessage.setText(header);
            }
            textMessage.setBackgroundColor(Dependencies.getThemeColor(activity));

            (dialog.findViewById(R.id.rv)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }

            });
            (dialog.findViewById(R.id.layoutWindow)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }

            });


            dlgPriorityLvw = dialog.findViewById(R.id.dlg_priority_lvw);
            // ListView
            dialogListAdapter = new DialogListAdapter(activity);
            dialogListAdapter.setData(arrayList);

            dlgPriorityLvw.setAdapter(dialogListAdapter);
            //ListView
            dlgPriorityLvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1,
                                        int arg2, long arg3) {
                    nnListItemClickListener.onListItemSelected(arg2, arrayList.get(arg2));
                    dialog.dismiss();
                }
            });

            dialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public interface OnListItemClickListener {
        void onListItemSelected(int pos, String item);
    }
}
