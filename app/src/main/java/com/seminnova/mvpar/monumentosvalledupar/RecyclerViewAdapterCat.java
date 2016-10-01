package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapterCat extends RecyclerView.Adapter<RecyclerViewHoldersCat> {

    private List<CategoriaObject> lisCat;
    private Context context;
    private FragmentManager fragmentManager;

    public RecyclerViewAdapterCat(Context context, List<CategoriaObject> lisCat, FragmentManager fragmentManager) {
        this.lisCat = lisCat;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public RecyclerViewHoldersCat onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHoldersCat rcv = new RecyclerViewHoldersCat(layoutView, fragmentManager);
        return rcv;

    }

    @Override
    public void onBindViewHolder(RecyclerViewHoldersCat holder, int position) {
        holder.monumentName.setText(lisCat.get(position).getNom());
        holder.monumentPhoto.setImageResource(lisCat.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return this.lisCat.size();
    }

}