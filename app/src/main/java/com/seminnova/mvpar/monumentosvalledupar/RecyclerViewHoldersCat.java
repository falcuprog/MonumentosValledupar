package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewHoldersCat extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView monumentName;
    public ImageView monumentPhoto;

    public FragmentManager fragmentManager;

    private Fragment fragment;

    public static List<MonumentoObject> listaMon = new ArrayList<MonumentoObject>();
    public static String titulo;
    public static int categoria;

    public RecyclerViewHoldersCat(View itemView, FragmentManager fragmentManager) {// ojo
        super(itemView);
        itemView.setOnClickListener(this);
        monumentName = (TextView)itemView.findViewById(R.id.monument_name);
        monumentPhoto = (ImageView)itemView.findViewById(R.id.monument_photo);
        this.fragmentManager = fragmentManager;
    }

    @Override
    public void onClick(View view) {

        int opc;

        opc = getPosition();

        switch (opc){

            case 0:

                listaMon = listaMontCat0();
                titulo = "Abstractos y Simbólicos";
                categoria = 0;

                fragment = new ListaMonFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();

                break;

            case 1:

                listaMon = listaMonCat1();
                titulo = "Culturales y Folclóricos";
                categoria = 1;

                fragment = new ListaMonFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();
                break;

            case 2:

                listaMon = listMonCat2();
                titulo = "Biográficos e Históricos";
                categoria = 2;

                fragment = new ListaMonFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();
                break;

            case 3:

                listaMon = listaMonCat3();
                titulo = "Deportivos";
                categoria = 3;

                fragment = new ListaMonFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();
                break;
            case 4:

                listaMon = listaMonCat4();
                titulo = "Religiosos";
                categoria = 4;

                fragment = new ListaMonFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();
                break;
        }

    }

    private List<MonumentoObject> listaMontCat0() {

        List<MonumentoObject> allItems = new ArrayList<MonumentoObject>();
        allItems.add(new MonumentoObject("Victoria", "", R.drawable.mon_victoria));
        allItems.add(new MonumentoObject("Fortaleza Valor y Justicia", "", R.drawable.mon_forta));
        allItems.add(new MonumentoObject("Lector del Tiempo", "", R.drawable.slider3_copia));
        allItems.add(new MonumentoObject("Sierra Nevada: Montaña Sagrada", "", R.drawable.mon_sierra));
        allItems.add(new MonumentoObject("El Obelisco", "", R.drawable.mon_obe));
        allItems.add(new MonumentoObject("Revolución en Marcha", "", R.drawable.mon_revol));

        return allItems;
    }

    private List<MonumentoObject> listaMonCat1(){

        List<MonumentoObject> allItems = new ArrayList<MonumentoObject>();
        allItems.add(new MonumentoObject("Pedazo de Acordeón", "", R.drawable.mon_pedazo));
        allItems.add(new MonumentoObject("Conjunto Vallenato", "", R.drawable.mon_cojun));
        allItems.add(new MonumentoObject("Los Poporos", "", R.drawable.mon_poporos));
        allItems.add(new MonumentoObject("María Mulata", "", R.drawable.mon_cojun));
        allItems.add(new MonumentoObject("La Sirena", "", R.drawable.mon_sirena));
        allItems.add(new MonumentoObject("Guacharaca", "", R.drawable.mon_guacha));
        allItems.add(new MonumentoObject("Las Dos Guitarras", "", R.drawable.mon_guitarras));
        allItems.add(new MonumentoObject("Pelea de Gallos", "", R.drawable.slider1_copia));
        allItems.add(new MonumentoObject("Caracol de Colores", "", R.drawable.mon_caracol));
        allItems.add(new MonumentoObject("Tambor de dos Parches", "", R.drawable.slider3_copia));
        allItems.add(new MonumentoObject("Gaitas", "", R.drawable.slider3_copia));
        allItems.add(new MonumentoObject("Maraca", "", R.drawable.slider3_copia));
        allItems.add(new MonumentoObject("Acordeón", "", R.drawable.mon_acordeon));
        allItems.add(new MonumentoObject("Monumento a las Guitarras", "", R.drawable.slider3_copia));
        allItems.add(new MonumentoObject("Caja", "", R.drawable.mon_caja));
        allItems.add(new MonumentoObject("Puya y Merengue", "", R.drawable.slider3_copia));
        allItems.add(new MonumentoObject("Paseo y Son", "", R.drawable.slider3_copia));

        return allItems;
    }

    private List<MonumentoObject> listMonCat2(){

        List<MonumentoObject> allItems = new ArrayList<MonumentoObject>();

        allItems.add(new MonumentoObject("Hernando de Santana", "", R.drawable.slider2_copia));
        allItems.add(new MonumentoObject("Pilonera Mayor", "", R.drawable.slider4_copia));
        allItems.add(new MonumentoObject("Cacique Upar", "", R.drawable.slider5_copia));
        allItems.add(new MonumentoObject("El Viajero", "", R.drawable.slider7_copia));
        allItems.add(new MonumentoObject("Parque de las Madres", "", R.drawable.slider1_copia));

        return allItems;
    }

    private List<MonumentoObject> listaMonCat3(){

        List<MonumentoObject> allItems = new ArrayList<MonumentoObject>();
        allItems.add(new MonumentoObject("Skate", "3 Villa Crescent London, UK", R.drawable.slider2_copia));

        return allItems;
    }

    private List<MonumentoObject> listaMonCat4(){

        List<MonumentoObject> allItems = new ArrayList<MonumentoObject>();
        allItems.add(new MonumentoObject("Juana Jugan", "Vildansvagen 19, Lund Sweden", R.drawable.slider1_copia));
        allItems.add(new MonumentoObject("Santo Ecce Homo", "3 Villa Crescent London, UK", R.drawable.slider2_copia));

        return allItems;
    }

}