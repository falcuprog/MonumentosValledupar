package com.seminnova.mvpar.monumentosvalledupar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DescMonumentoFragment extends Fragment {

    private SliderLayout mDemoSlider;
    private LinearLayoutManager lLayout;

    String titulo;
    ArrayList<Integer> lista = new ArrayList<Integer>();

    List<ItemObjectDescMon> rowListItem = new ArrayList<ItemObjectDescMon>();

    public DescMonumentoFragment() {
        // Required empty public constructor
    }

    public void setData(List<ItemObjectDescMon> ls) {

        rowListItem = ls;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_desc_monumento, container, false);

        titulo = DescMonumento.titulo;
        lista = DescMonumento.lista;


        //((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);

        mDemoSlider = (SliderLayout) view.findViewById(R.id.slider_desc);
        HashMap<String,Integer> url_maps = new HashMap<String, Integer>();
        
        for (int i = 0; i < lista.size(); i++) {
            url_maps.put(titulo + " ", lista.get(i));
        }

        //mDemoSlider.stopAutoCycle();

        for(String name : url_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(view.getContext());//
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    //.image(url_maps.get(name))
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);


        /*
        *
        *
        *
        */

        //lLayout = new LinearLayoutManager(getParent());
        lLayout = new LinearLayoutManager(getActivity().getParent());


        /*rowListItem.add(new ItemObjectDescMon("Nombre","Sierra Nevada: Montaña Sagrada",""));
        rowListItem.add(new ItemObjectDescMon("Autor", "Gabriel Beltrán",""));
        rowListItem.add(new ItemObjectDescMon("Medidas", "4.5 mts Alto\n6.0 mts Largo\n4.5 mts Ancho",""));
        rowListItem.add(new ItemObjectDescMon("Ubicación","Plazoleta de Banderas Gobernación del Cesar",""));
        rowListItem.add(new ItemObjectDescMon("Categoría", "Abstractos",""));
        rowListItem.add(new ItemObjectDescMon("Técnica","Acero 304 ensamblado, soldado y bruñido. Ensamble y armado en el sitio determinado",""));
        rowListItem.add(new ItemObjectDescMon("Reseña","","Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región.Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región."));*/



        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view_descmon);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapterDescMon rcAdapter = new RecyclerViewAdapterDescMon(view.getContext(), rowListItem);
        rView.setAdapter(rcAdapter);

        /*
        *
        * */

        return view;

    }

    /*@Override
    public void onStop() {
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }*/

    /*@Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }*/

    @Override
    public void onResume() {
        super.onResume();

        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    // handle back button's click listener
                    //Toast.makeText(getActivity(), "Back press", Toast.LENGTH_SHORT).show();

                    rowListItem = null;

                    //Fragment fragment = new MonAbsFragment();
                    FragmentManager fragMana = getActivity().getSupportFragmentManager();
                    fragMana.beginTransaction()
                            .remove(DescMonumentoFragment.this)
                            //.replace(R.id.content_frame2, fragment)
                            //.hide(DescMonumentoFragment.this)
                            .commit();

                    return true;
                }
                return false;
            }
        });

    }

}
