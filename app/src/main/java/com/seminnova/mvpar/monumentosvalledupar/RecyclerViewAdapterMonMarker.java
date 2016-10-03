package com.seminnova.mvpar.monumentosvalledupar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapterMonMarker extends RecyclerView.Adapter<RecyclerViewHolderMonMarker> {

    private List<MonumentoMarker> ls;
    private Context context;

    public RecyclerViewAdapterMonMarker(Context context, List<MonumentoMarker> ls) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public RecyclerViewHolderMonMarker onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_monmarker, null);
        RecyclerViewHolderMonMarker rcv = new RecyclerViewHolderMonMarker(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderMonMarker holder, int position) {

        try {

            if (ls.get(position).getNombre().length() <= 17) {
                holder.nom_mon.setText(ls.get(position).getNombre());
            } else {
                holder.nom_mon.setText(ls.get(position).getNombre().substring(0, 15) + "...");
            }
        } catch (Exception e) {}
        holder.dis_mon.setText(ls.get(position).getDistanciakm());
        holder.dur_mon.setText(ls.get(position).getDuracion());
        //holder.dismt_mon.setText(Double.toString(ls.get(position).getDistanciamt()));
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

}
