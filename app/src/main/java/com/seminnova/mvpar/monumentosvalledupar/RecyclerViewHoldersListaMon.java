package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHoldersListaMon extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView monNom;
    public TextView monDes;
    public ImageView monImg;
    private FragmentManager fragMana;
    public static int categoria;
    public static String titulo;
    public int monumento;

    public RecyclerViewHoldersListaMon(View itemView, FragmentManager fragmentManager) {
        super(itemView);

        itemView.setOnClickListener(this);

        monNom = (TextView)itemView.findViewById(R.id.monNom);
        monDes = (TextView)itemView.findViewById(R.id.monDes);
        monImg = (ImageView)itemView.findViewById(R.id.monImg);
        fragMana = fragmentManager;
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(view.getContext(), "Monumento " + getPosition(), Toast.LENGTH_SHORT).show();

        categoria = RecyclerViewHoldersCat.categoria;

        monumento = getPosition();

        DescMonumento descMonumento = new DescMonumento(categoria, monumento, fragMana);
        descMonumento.mostrarDescripcion();

    }

}
