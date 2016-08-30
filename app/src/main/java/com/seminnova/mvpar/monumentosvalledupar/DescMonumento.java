package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

public class DescMonumento {

    Fragment fragment;
    FragmentManager fragmentManager;

    public static int categoria, monumento;
    public static ArrayList<Integer> lista;
    public static String titulo;

    public List<ItemObjectDescMon> rowListItem = new ArrayList<ItemObjectDescMon>();

    public DescMonumento(int categoria, int monumento, FragmentManager fragmentManager) {

        lista = new ArrayList<Integer>();
        this.categoria = categoria;
        this.monumento = monumento;
        this.fragmentManager = fragmentManager;
    }

    public void mostrarDescripcion() {

        DescMonumentoFragment descMonumentoFragment;

        switch (categoria) {

            case 0:

                switch (monumento) {

                    case 0:

                        rowListItem.add(new ItemObjectDescMon("Nombre","Sierra Nevada: Montaña Sagrada1",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Gabriel Beltrán1",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "4.5 mts Alto\n6.0 mts Largo\n4.5 mts Ancho1",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Plazoleta de Banderas Gobernación del Cesar1",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstractos1",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","1Acero 304 ensamblado, soldado y bruñido. Ensamble y armado en el sitio determinado",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","1Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región.Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región."));

                        titulo = "Victoria";
                        lista.add(R.drawable.slider1);
                        lista.add(R.drawable.slider2);
                        lista.add(R.drawable.slider3);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 1:

                        rowListItem.add(new ItemObjectDescMon("Nombre","2Sierra Nevada: Montaña Sagrada",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "2Gabriel Beltrán",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "24.5 mts Alto\n6.0 mts Largo\n4.5 mts Ancho",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","2Plazoleta de Banderas Gobernación del Cesar",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "2Abstractos",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","2Acero 304 ensamblado, soldado y bruñido. Ensamble y armado en el sitio determinado",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","2Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región.Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región."));

                        titulo = "Fortaleza Valor y Justicia";
                        lista.add(R.drawable.slider1);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 2:

                        titulo = "Lector del Tiempo";
                        lista.add(R.drawable.slider1);
                        lista.add(R.drawable.slider2);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 3:

                        titulo = "Sierra Nevada, Montaña Sagrada";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 4:

                        titulo = "El Obelisco";
                        lista.add(R.drawable.slider1);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 5:

                        titulo = "Revolución en Marcha";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 6:

                        titulo = "Luna Vallenata";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                }
                break;

            case 1:

                switch (monumento) {

                    case 0:

                        titulo = "Hernando de Santana";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 1:

                        titulo = "Pilonera Mayor";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 2:

                        titulo = "Cacique Upar";
                        lista.add(R.drawable.slider1);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 3:

                        titulo = "El Viajero";
                        lista.add(R.drawable.slider1);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 4:

                        titulo = "Parque de las Madres";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                }
                break;

            case 2:

                switch (monumento) {

                    case 0:

                        titulo = "Pedazo de Acordeón";
                        lista.add(R.drawable.slider1);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 1:

                        titulo = "Conjunto Vallenato";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 2:

                        titulo = "Los Poporos";
                        lista.add(R.drawable.slider1);
                        lista.add(R.drawable.slider2);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 3:

                        titulo = "María Mulata";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 4:

                        titulo = "La sirena";
                        lista.add(R.drawable.slider1);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 5:

                        titulo = "Guacharaca";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 6:

                        titulo = "Las Dos Guitarras";
                        lista.add(R.drawable.slider1);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 7:

                        titulo = "Pelea de Gallos";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 8:

                        titulo = "Caracol de Colores";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 9:

                        titulo = "Tambor de Dos Parches";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 10:

                        titulo = "Gaitas";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 11:

                        titulo = "Maraca";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 12:

                        titulo = "Acordeón";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 13:

                        titulo = "Monumento a las Guitarras";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 14:

                        titulo = "Caja";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 15:

                        titulo = "Puya y Merengue";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 16:

                        titulo = "Paseo y Son";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                }
                break;

            case 3:

                switch (monumento) {

                    case 0:

                        titulo = "Skate";
                        lista.add(R.drawable.slider1);
                        lista.add(R.drawable.slider2);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                }
                break;

            case 4:

                switch (monumento) {

                    case 0:

                        titulo = "Juan Jugan";
                        lista.add(R.drawable.slider1);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 1:

                        titulo = "Santo Ecce Homo";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                }
                break;

        }

    }

}
