package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView monumentName;
    public ImageView monumentPhoto;

    public FragmentManager fragmentManager; //ojo

    private Fragment fragment;

    public static List<ItemObjectMonAbs> listaMon = new ArrayList<ItemObjectMonAbs>();
    public static String titulo;
    public static int categoria;

    public RecyclerViewHolders(View itemView, FragmentManager fragmentManager) {// ojo
        super(itemView);
        itemView.setOnClickListener(this);
        monumentName = (TextView)itemView.findViewById(R.id.monument_name);
        monumentPhoto = (ImageView)itemView.findViewById(R.id.monument_photo);
        this.fragmentManager = fragmentManager;
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(view.getContext(), "Categoría: " + getPosition(), Toast.LENGTH_SHORT).show();

        int opc;

        opc = getPosition();

        switch (opc){

            case 0: //Toast.makeText(view.getContext(), "Monumentos Abstractos", Toast.LENGTH_SHORT).show();

                listaMon = getAllItemListCat0();
                titulo = "Abstractos y Simbólicos";
                categoria = 0;

                fragment = new MonAbsFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();

                break;
            case 1: //Toast.makeText(view.getContext(), "Monumentos Arquitectónicos", Toast.LENGTH_SHORT).show();
                listaMon = getAllItemListCat1();
                titulo = "Culturales y Folclóricos";
                categoria = 2;

                fragment = new MonAbsFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();
                break;

            case 2: //Toast.makeText(view.getContext(), "Monumentos Biográficos", Toast.LENGTH_SHORT).show();

                listaMon = getAllItemListCat2();
                titulo = "Biográficos e Históricos";
                categoria = 1;

                fragment = new MonAbsFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();
                break;

            case 3: //Toast.makeText(view.getContext(), "Monumentos Deportivos", Toast.LENGTH_SHORT).show();

                listaMon = getAllItemListCat3();
                titulo = "Deportivos";
                categoria = 3;

                fragment = new MonAbsFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();
                break;
            case 4: //Toast.makeText(view.getContext(), "Monumentos Deportivos", Toast.LENGTH_SHORT).show();

                listaMon = getAllItemListCat4();
                titulo = "Religiosos";
                categoria = 4;

                fragment = new MonAbsFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame2, fragment)
                        .commit();
                break;
        }

    }

    private List<ItemObjectMonAbs> getAllItemListCat0() {

        List<ItemObjectMonAbs> allItems = new ArrayList<ItemObjectMonAbs>();
        allItems.add(new ItemObjectMonAbs("Victoria", "", R.drawable.slider1_copia));
        allItems.add(new ItemObjectMonAbs("Fortaleza Valor y Justicia", "", R.drawable.slider2_copia));
        allItems.add(new ItemObjectMonAbs("Lector del Tiempo", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Sierra Nevada: Montaña Sagrada", "", R.drawable.slider4_copia));
        allItems.add(new ItemObjectMonAbs("El Obelisco", "", R.drawable.slider5_copia));
        allItems.add(new ItemObjectMonAbs("Revolución en Marcha", "", R.drawable.slider6_copia));
        allItems.add(new ItemObjectMonAbs("Luna Vallenata", "", R.drawable.slider7_copia));

        return allItems;
    }

    private List<ItemObjectMonAbs> getAllItemListCat2(){

        List<ItemObjectMonAbs> allItems = new ArrayList<ItemObjectMonAbs>();

        allItems.add(new ItemObjectMonAbs("Hernando de Santana", "", R.drawable.slider2_copia));
        allItems.add(new ItemObjectMonAbs("Pilonera Mayor", "", R.drawable.slider4_copia));
        allItems.add(new ItemObjectMonAbs("Cacique Upar", "", R.drawable.slider5_copia));
        allItems.add(new ItemObjectMonAbs("El Viajero", "", R.drawable.slider7_copia));
        allItems.add(new ItemObjectMonAbs("Parque de las Madres", "", R.drawable.slider1_copia));

        return allItems;
    }

    private List<ItemObjectMonAbs> getAllItemListCat1(){

        List<ItemObjectMonAbs> allItems = new ArrayList<ItemObjectMonAbs>();
        allItems.add(new ItemObjectMonAbs("Pedazo de Acordeón", "", R.drawable.slider1_copia));
        allItems.add(new ItemObjectMonAbs("Conjunto Vallenato", "", R.drawable.slider2_copia));
        allItems.add(new ItemObjectMonAbs("Los Poporos", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("María Mulata", "", R.drawable.slider4_copia));
        allItems.add(new ItemObjectMonAbs("La Sirena", "", R.drawable.slider5_copia));
        allItems.add(new ItemObjectMonAbs("Guacharaca", "", R.drawable.slider6_copia));
        allItems.add(new ItemObjectMonAbs("Las Dos Guitarras", "", R.drawable.slider7_copia));
        allItems.add(new ItemObjectMonAbs("Pelea de Gallos", "", R.drawable.slider1_copia));
        allItems.add(new ItemObjectMonAbs("Caracol de Colores", "", R.drawable.slider2_copia));
        allItems.add(new ItemObjectMonAbs("Tambor de los Parches", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Tambor Alegre", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Gaitas", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Maraca", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Acordeón", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Monumento a las Guitarras", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Caja", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Puya y Merengue", "", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Paseo y Son", "", R.drawable.slider3_copia));

        return allItems;
    }

    private List<ItemObjectMonAbs> getAllItemListCat3(){

        List<ItemObjectMonAbs> allItems = new ArrayList<ItemObjectMonAbs>();
        allItems.add(new ItemObjectMonAbs("Skate", "3 Villa Crescent London, UK", R.drawable.slider2_copia));

        return allItems;
    }

    private List<ItemObjectMonAbs> getAllItemListCat4(){

        List<ItemObjectMonAbs> allItems = new ArrayList<ItemObjectMonAbs>();
        allItems.add(new ItemObjectMonAbs("Juana Jugan", "Vildansvagen 19, Lund Sweden", R.drawable.slider1_copia));
        allItems.add(new ItemObjectMonAbs("Santo Ecce Homo", "3 Villa Crescent London, UK", R.drawable.slider2_copia));

        return allItems;
    }

}