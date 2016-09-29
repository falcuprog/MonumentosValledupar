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
    public static Fragment f;

    public List<ItemObjectDescMon> rowListItem = new ArrayList<ItemObjectDescMon>();

    public DescMonumento(int categoria, int monumento, FragmentManager fragmentManager, Fragment f) {
        lista = new ArrayList<Integer>();
        this.categoria = categoria;
        this.monumento = monumento;
        this.fragmentManager = fragmentManager;
        this.f = f;
    }

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
                        lista.add(R.drawable.mon_victoria);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .add(R.id.content_frame2, descMonumentoFragment)
                                .hide(f)
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
                        lista.add(R.drawable.mon_forta);

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
                        lista.add(R.drawable.mon_sierra);

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
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Este monumento fue concebido como un homenaje a la vida."));

                        titulo = "El Obelisco";
                        lista.add(R.drawable.mon_obe);

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
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Este monumento conmemora a uno de los vallenatos más queridos, antiguo presidente de la República de Colombia, Dr. Alfonso López Pumarejo, quien llamó a su programa de gobierno \"La Revolución en Marcha\" que tenía como prioridad la modernización del país y su ingreso a la economía capitalista, es entonces cuando Valledupar deja de ser una remota aldea para convertirse en una ciudad prometedora."));

                        titulo = "Revolución en Marcha";
                        lista.add(R.drawable.mon_revol);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 6:

                        /*rowListItem.add(new ItemObjectDescMon("Nombre","LUNA VALLENATA",""));
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
                                .commit();*/
                        break;

                }
                break;

            case 1:

                switch (monumento) {

                    case 0:

                        rowListItem.add(new ItemObjectDescMon("Nombre","MI PEDAZO DE ACORDEÓN",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Gabriel Beltrán",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "6 mts Alto x 10 mts Largo x 4.5 Ancho",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida Hurtado",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Hierro, bronce fosforado, bruñido y ensamblado, cobre rojo ensamblado.",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Este monumento rinde  homenaje al acordeonero, cantor, compositor y  juglar por excelencia Alejandro Durán, quien con su canción \"Mi Pedazo de Acordeón\" pasó a convertirla en símbolo músical costeño."));

                        titulo = "Pedazo de Acordeón";
                        lista.add(R.drawable.mon_pedazo);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 1:

                        rowListItem.add(new ItemObjectDescMon("Nombre","HOMENAJE AL FOLCLOR VALLENATO",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Jorge Maestre",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","N.D"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Diagonal 23 Avenida Simón Bolívar",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","N.D",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Representa a los tres integrantes típicos de la música vallenata: acordeonero, guacharaquero y cajero."));

                        titulo = "Conjunto Vallenato";

                        lista.add(R.drawable.mon_cojun);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 2:


                        rowListItem.add(new ItemObjectDescMon("Nombre","LOS POPOROS",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Jorge Maestre",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","N.D"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida Juventud frente al Coliseo Cubierto Julio Cesar Monsalvo",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Bronce fundido a la cera perdida",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Representa a las tres etnias indígenas que aún habitan en la Sierra Nevada (Arhuacos, Koguis y Arzarios)."));

                        titulo = "Los Poporos";
                        lista.add(R.drawable.mon_poporos);


                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 3:

                        rowListItem.add(new ItemObjectDescMon("Nombre","MARÍA MULATA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Enrique Grau",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","N.D"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Glorieta de la carrera 16 con calle 18",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Bronce",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Caracteriza la integración de los elementos que identifica a Colombia y sus costas. (El componente humano, la fauna y la mezcla de las etnias)."));

                        titulo = "María Mulata";


                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 4:

                        rowListItem.add(new ItemObjectDescMon("Nombre","SIRENA VALLENATA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Jorge Maestre",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","7 mts Alto"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Río Guatapurí",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Fibra de vidrio",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Representa una de las leyendas de tradición en la mitología vallenata conocida como \"La Sirena de Hurtado\" trata de una niña que un  jueves santo fue a bañarse al río Guatapurí y se convirtió en sirena."));

                        titulo = "La sirena";
                        lista.add(R.drawable.mon_sirena);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 5:

                        rowListItem.add(new ItemObjectDescMon("Nombre","GUACHARACA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","5.10 mts x 1.30 mts x 1.30 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Está inspirado en un instrumento musical muy conocido en la música vallenata como la guacharaca que se toca con un trinche o peine, según el ritmo de la música."));

                        titulo = "Guacharaca";
                        lista.add(R.drawable.mon_guacha);

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 6:

                        rowListItem.add(new ItemObjectDescMon("Nombre","GUITARRAS",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","3.80 mts x 2.00 mts x 0.80 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Está inspirado en un instrumento alusivo a la música vallenata, la guitarra, la cual tiene unas cuerdas con varios sonidos con los que se puede interpretar una canción o un ritmo."));

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

                        rowListItem.add(new ItemObjectDescMon("Nombre","PELEA DE GALLOS",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elma Pignalosa",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","3.80 mts x 2.00 mts x 0.80 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Intersección Avenida Simon Bolivar con Trasversal 16C",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Bronce, hierro y láminas de Aluminio",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","En un homenaje a la afición gallística que existe en los departamentos costeños, que evocan una tradición cultural."));


                        titulo = "Pelea de Gallos";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 8:

                        rowListItem.add(new ItemObjectDescMon("Nombre","CARACOL DE COLORES",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","4.70 mts x 4.70 mts x 0.80 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Está inspirado en el primer instrumento de sonido que utilizaron los indígenas."));

                        titulo = "Caracol de Colores";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 9:

                        rowListItem.add(new ItemObjectDescMon("Nombre","TAMBOR DE DOS PARCHES",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","3.40 mts x 1.70 mts x 1.70 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Apología de la evolución de los sonidos."));

                        titulo = "Tambor de Dos Parches";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 10:

                        rowListItem.add(new ItemObjectDescMon("Nombre","GAITAS",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","5.20 mts x 0.80 mts x 0.70 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","N.D"));

                        titulo = "Gaitas";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 11:

                        rowListItem.add(new ItemObjectDescMon("Nombre","MARACAS",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","4.40 mts x 1.80 mts x 1.80 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","N.D"));


                        titulo = "Maraca";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 12:

                        rowListItem.add(new ItemObjectDescMon("Nombre","ACORDEÓN",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","4.30 mts x 6.10 mts x 1.40 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","N.D"));

                        titulo = "Acordeón";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 13:

                        rowListItem.add(new ItemObjectDescMon("Nombre","LAS DOS GUITARRAS",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Manuel José Rincón",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","6.0 mts Alto"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Tarima Juan R. Leyva. Plaza 1ro de Mayo",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Chatarra",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","Representa la importancia de la guitarra en el folclor local y homenajea a los instrumentistas reconocidos en la música vallenata que influyeron en la música y sus expresiones."));

                        titulo = "Monumento a las Guitarras";

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 14:

                        rowListItem.add(new ItemObjectDescMon("Nombre","CAJA",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","3.40 mts x 1.90 mts x 1.90 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","N.D"));

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

                        rowListItem.add(new ItemObjectDescMon("Nombre","PUYA Y MERENGUE",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "","5.40 mts x 2.00 mts x 0.30 mts"));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","N.D"));

                        descMonumentoFragment = new DescMonumentoFragment();
                        descMonumentoFragment.setData(rowListItem);
                        fragmentManager.beginTransaction()
                                .replace(R.id.content_frame2, descMonumentoFragment)
                                .addToBackStack(null)
                                .commit();
                        break;

                    case 16:

                        rowListItem.add(new ItemObjectDescMon("Nombre","PASEO Y SON",""));
                        rowListItem.add(new ItemObjectDescMon("Autor", "Elsa Marina Losada",""));
                        rowListItem.add(new ItemObjectDescMon("Medidas", "5.40 mts x 2.00 mts x 0.30 mts",""));
                        rowListItem.add(new ItemObjectDescMon("Ubicación","Avenida 44",""));
                        rowListItem.add(new ItemObjectDescMon("Categoría", "Folclórico",""));
                        rowListItem.add(new ItemObjectDescMon("Técnica","Mosaico de cerámica sobre concreto",""));
                        rowListItem.add(new ItemObjectDescMon("Reseña","","N.D"));

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

            /*case 2:

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
            */
        }

    }

}
