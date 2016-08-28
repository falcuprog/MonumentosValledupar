package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHoldersMonAbs extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView personName;
    public TextView personAddress;
    public ImageView personPhoto;
    private FragmentManager fragMana;
    public static int categoria;
    public static String titulo;
    public int monumento;

    public RecyclerViewHoldersMonAbs(View itemView, FragmentManager fragmentManager) {
        super(itemView);

        itemView.setOnClickListener(this);

        personName = (TextView)itemView.findViewById(R.id.person_name_monabs);
        personAddress = (TextView)itemView.findViewById(R.id.person_address_monabs);
        personPhoto = (ImageView)itemView.findViewById(R.id.circleView_monabs);
        fragMana = fragmentManager;
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(view.getContext(), "Monumento " + getPosition(), Toast.LENGTH_SHORT).show();

        categoria = RecyclerViewHolders.categoria;

        monumento = getPosition();

        DescMonumento descMonumento = new DescMonumento(categoria, monumento, fragMana);
        descMonumento.mostrarDescripcion();

    }
}
