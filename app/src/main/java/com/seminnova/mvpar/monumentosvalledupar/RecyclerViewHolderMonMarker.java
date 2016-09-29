package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolderMonMarker extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView nom_mon;
    public TextView dis_mon;
    public TextView dur_mon;

    public RecyclerViewHolderMonMarker(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        nom_mon = (TextView) itemView.findViewById(R.id.nom_mon);
        dis_mon = (TextView) itemView.findViewById(R.id.dis_mon);
        dur_mon = (TextView) itemView.findViewById(R.id.dur_mon);

    }

    @Override
    public void onClick(View view) {

    }
}
