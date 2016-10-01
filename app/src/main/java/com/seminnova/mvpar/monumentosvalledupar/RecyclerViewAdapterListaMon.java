package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapterListaMon extends RecyclerView.Adapter<RecyclerViewHoldersListaMon> {

    private List<MonumentoObject> lsMon;
    private Context context;
    private FragmentManager fragmentManager;

    public RecyclerViewAdapterListaMon(Context context, List<MonumentoObject> lsMon, FragmentManager fragmentManager) {
        this.lsMon = lsMon;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public RecyclerViewHoldersListaMon onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_listamon, null);
        RecyclerViewHoldersListaMon rcv = new RecyclerViewHoldersListaMon(layoutView, fragmentManager);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHoldersListaMon holder, int position) {
        holder.monNom.setText(lsMon.get(position).getNombre());
        holder.monDes.setText(lsMon.get(position).getDescripcion());
        holder.monImg.setImageResource(lsMon.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return this.lsMon.size();
    }

}
