package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class RecyclerViewHoldersDescMon extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView itemMon;
    public TextView descMon;
    public JustifyTextView desc2Mon;

    public RecyclerViewHoldersDescMon(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        itemMon = (TextView) itemView.findViewById(R.id.item_mon);
        descMon = (TextView) itemView.findViewById(R.id.desc_mon);
        desc2Mon = (JustifyTextView) itemView.findViewById(R.id.desc2_mon);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(view.getContext(), "Monumento " + getPosition(), Toast.LENGTH_SHORT).show();

    }
}
