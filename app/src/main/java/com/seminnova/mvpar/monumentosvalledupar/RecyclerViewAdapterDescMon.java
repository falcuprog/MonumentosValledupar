package com.seminnova.mvpar.monumentosvalledupar;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapterDescMon extends RecyclerView.Adapter<RecyclerViewHoldersDescMon> {

    private List<DescMonObject> lsMon;
    private Context context;

    public RecyclerViewAdapterDescMon(Context context, List<DescMonObject> lsMon) {
        this.lsMon = lsMon;
        this.context = context;
    }

    @Override
    public RecyclerViewHoldersDescMon onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_descmon, null);
        RecyclerViewHoldersDescMon rcv = new RecyclerViewHoldersDescMon(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHoldersDescMon holder, int position) {

        holder.itemMon.setText(lsMon.get(position).getItem());
        holder.descMon.setText(lsMon.get(position).getDesc());
        holder.desc2Mon.setText(lsMon.get(position).getDesc2());

        //holder.itemView.findViewById(R.id.separador).setBackgroundColor(0xffffffff);

        if (lsMon.get(position).getDesc2().equals("")) {
            holder.itemView.findViewById(R.id.separador2).setBackgroundColor(Color.TRANSPARENT);
        } else {
            holder.itemView.findViewById(R.id.separador).setBackgroundColor(Color.TRANSPARENT);
        }

    }

    @Override
    public int getItemCount() {
        return this.lsMon.size();
    }

}
