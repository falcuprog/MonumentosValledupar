package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapterMonAbs extends RecyclerView.Adapter<RecyclerViewHoldersMonAbs> {

    private List<ItemObjectMonAbs> itemList;
    private Context context;
    private FragmentManager fragmentManager;

    public RecyclerViewAdapterMonAbs(Context context, List<ItemObjectMonAbs> itemList, FragmentManager fragmentManager) {
        this.itemList = itemList;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public RecyclerViewHoldersMonAbs onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_monabs, null);
        RecyclerViewHoldersMonAbs rcv = new RecyclerViewHoldersMonAbs(layoutView, fragmentManager);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHoldersMonAbs holder, int position) {
        holder.personName.setText(itemList.get(position).getName());
        holder.personAddress.setText(itemList.get(position).getAddress());
        holder.personPhoto.setImageResource(itemList.get(position).getPhotoId());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

}
