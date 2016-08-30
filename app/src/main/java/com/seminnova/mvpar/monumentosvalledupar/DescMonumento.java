package com.seminnova.mvpar.monumentosvalledupar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

public class DescMonumento {

    public static int categoria, monumento;
    Fragment fragment;
    FragmentManager fragmentManager;
    public static ArrayList<Integer> lista;
    public static String titulo;

    public DescMonumento(int categoria, int monumento, FragmentManager fragmentManager) {

        lista = new ArrayList<Integer>();
        this.categoria = categoria;
        this.monumento = monumento;
        this.fragmentManager = fragmentManager;
    }

    public void mostrarDescripcion() {

        switch (categoria) {

            case 0:

                switch (monumento) {

                    case 0:

                        titulo = "Victoria";
                        lista.add(R.drawable.slider1);
                        lista.add(R.drawable.slider2);
                        lista.add(R.drawable.slider3);

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 1:

                        titulo = "Fortaleza Valor y Justicia";
                        lista.add(R.drawable.slider1);
                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 2:

                        titulo = "Lector del Tiempo";
                        lista.add(R.drawable.slider1);
                        lista.add(R.drawable.slider2);

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 3:

                        titulo = "Sierra Nevada, Montaña Sagrada";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 4:

                        titulo = "El Obelisco";
                        lista.add(R.drawable.slider1);

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 5:

                        titulo = "Revolución en Marcha";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 6:

                        titulo = "Luna Vallenata";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                }
                break;

            case 1:

                switch (monumento) {

                    case 0:

                        titulo = "Hernando de Santana";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 1:

                        titulo = "Pilonera Mayor";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 2:

                        titulo = "Cacique Upar";
                        lista.add(R.drawable.slider1);

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 3:

                        titulo = "El Viajero";
                        lista.add(R.drawable.slider1);

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 4:

                        titulo = "Parque de las Madres";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
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

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 1:

                        titulo = "Conjunto Vallenato";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 2:

                        titulo = "Los Poporos";
                        lista.add(R.drawable.slider1);
                        lista.add(R.drawable.slider2);

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 3:

                        titulo = "María Mulata";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 4:

                        titulo = "La sirena";
                        lista.add(R.drawable.slider1);

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 5:

                        titulo = "Guacharaca";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 6:

                        titulo = "Las Dos Guitarras";
                        lista.add(R.drawable.slider1);

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 7:

                        titulo = "Pelea de Gallos";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 8:

                        titulo = "Caracol de Colores";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 9:

                        titulo = "Tambor de Dos Parches";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 10:

                        titulo = "Gaitas";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 11:

                        titulo = "Maraca";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 12:

                        titulo = "Acordeón";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 13:

                        titulo = "Monumento a las Guitarras";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 14:

                        titulo = "Caja";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 15:

                        titulo = "Puya y Merengue";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 16:

                        titulo = "Paseo y Son";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
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

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
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

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 1:

                        titulo = "Santo Ecce Homo";

                        fragment = new DescMonumentoFragment();
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, fragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                }
                break;

        }

    }



}
