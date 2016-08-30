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

                        rowListItem.add(new ItemObjectDescMon("Nombre","VICTORIA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Gabriel Beltrán",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "7 mts x 3.20 mts x 2.25 mts",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Coliseo Cubierto Julio Monsalvo",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstracto",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Acero 304 ensamblado soldado, bruñido y espejo",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Representa la sensación de haber llegado a la meta, cumpliendo con el logro de los objetivos en cada uno de los eventos deportivos donde se relacionan la velocidad, los movimientos y el trabajo en equipo."));

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

                        rowListItem.add(new ItemObjectDescMon("Nombre","FORTALEZA, VALOR Y JUSTICIA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Gabriel Beltrán",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "4.30 mts de alto x 180 mts de largo x 140 mts",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Plazoleta de Banderas. Gobernación del Cesar",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstracto",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Acero 304 ensamblado, soldado y pintado. (Electrostática)",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Hace referencia al Cacique Upar, jefe de jefes que se distinguía por su fortaleza, valor y justicia en el pueblo de los Chimilas."));

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

                        rowListItem.add(new ItemObjectDescMon("Nombre","LECTOR DEL TIEMPO",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Juan Zuleta",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "4.30 mts de alto x 180 mts de largo x 140 mts",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Archivo departamental Anibal Martínez Zuleta",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstracto",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Elaborado en chatarra",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Es una semejanza a los antiguos historiadores de la región del Valle de Upar, los cuales estudiaban los archivos, mantenían la organización y conservación de los mismos."));

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

                        rowListItem.add(new ItemObjectDescMon("Nombre","SIERRA NEVADA, MONTAÑA SAGRADA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Gabriel Beltrán",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "4.5 mts Alto x 6.0 mts Largo x 4.5 mts Ancho",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Plazoleta de Banderas. Gobernación del Cesar",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstracto",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Acero 304 ensamblado, soldado y bruñido,Ensamble y armado en el sitio determinado",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Es una semejanza a los antiguos historiadores de la región del Valle de Upar, los cuales estudiaban los archivos, mantenían la organización y conservación de los mismos."));

                        titulo = "Sierra Nevada, Montaña Sagrada";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case 4:

                        rowListItem.add(new ItemObjectDescMon("Nombre","EL OBELISCO",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Carlos García",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "30 mts de altura",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Entrada a Valledupar, vía a Barranquilla",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstracto",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Cemento",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Este monumento hace un homenaje a la vida."));

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

                        rowListItem.add(new ItemObjectDescMon("Nombre","REVOLUCIÓN EN MARCHA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Rodrigo Arenas  Betancourt",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "N.D",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Plaza Alfonso López",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstracto",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Acero y bronce",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Este monumento conmemora a uno de los vallenatos más queridos, antiguo presidente de la República de Colombia, Dr. Alfonso López Pumarejo, quien llamó a su programa de gobierno <<La Revolución en Marcha>> que tenía como prioridad la modernización del país y su ingreso a la economía capitalista, es entonces cuando Valledupar deja de ser una remota aldea para convertirse en una ciudad prometedora."));

                        titulo = "Revolución en Marcha";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 6:

                        rowListItem.add(new ItemObjectDescMon("Nombre","LUNA VALLENATA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Juan Zuleta",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "30 mts de altura",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Parque barrio La Nevada",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstracto",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Elaborado en chatarra",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Representa la necesidad de rescatar la bohemia y la poesía donde se elogiaba a la mujer y la energía femenina, cuando la Luna era fuente de inspiración de los enamorados y compositores."));

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
