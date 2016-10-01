package com.seminnova.mvpar.monumentosvalledupar;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.Transformers.BaseTransformer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DescMonumentoFragment extends Fragment implements BaseSliderView.OnSliderClickListener {

    private SliderLayout mDemoSlider;
    private LinearLayoutManager lLayout;

    String titulo;
    ArrayList<Integer> lista = new ArrayList<Integer>();

    List<DescMonObject> rowListItem = new ArrayList<DescMonObject>();

    public DescMonumentoFragment() {
        // Required empty public constructor
    }

    public void setData(List<DescMonObject> ls) {

        rowListItem = ls;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_desc_monumento, container, false);

        titulo = DescMonumento.titulo;
        lista = DescMonumento.lista;

        //((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);

        mDemoSlider = (SliderLayout) view.findViewById(R.id.slider_desc);
        HashMap<String,Integer> url_maps = new HashMap<String, Integer>();
        
        for (int i = 0; i < lista.size(); i++) {
            url_maps.put(titulo + " ", lista.get(i));
        }

        mDemoSlider.stopAutoCycle();

        /*for(String name : url_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(view.getContext());//
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }*/

        for(String name : url_maps.keySet()){
            DefaultSliderView defaultSliderView = new DefaultSliderView(view.getContext());

            defaultSliderView
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.FitCenterCrop)
                    .setOnSliderClickListener(this);
            mDemoSlider.addSlider(defaultSliderView);
        }

        mDemoSlider.setPagerTransformer(false, new BaseTransformer() {
            @Override
            protected void onTransform(View view, float position) {
            }
        });



        //mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        //mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        //mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        //mDemoSlider.setDuration(4000);

        /*
        *
        *
        *
        */

        //lLayout = new LinearLayoutManager(getParent());
        lLayout = new LinearLayoutManager(getActivity().getParent());


        /*rowListItem.add(new DescMonObject("Nombre","Sierra Nevada: Montaña Sagrada",""));
        rowListItem.add(new DescMonObject("Autor", "Gabriel Beltrán",""));
        rowListItem.add(new DescMonObject("Medidas", "4.5 mts Alto\n6.0 mts Largo\n4.5 mts Ancho",""));
        rowListItem.add(new DescMonObject("Ubicación","Plazoleta de Banderas Gobernación del Cesar",""));
        rowListItem.add(new DescMonObject("Categoría", "Abstractos",""));
        rowListItem.add(new DescMonObject("Técnica","Acero 304 ensamblado, soldado y bruñido. Ensamble y armado en el sitio determinado",""));
        rowListItem.add(new DescMonObject("Reseña","","Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región.Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región."));*/



        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view_descmon);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapterDescMon rcAdapter = new RecyclerViewAdapterDescMon(view.getContext(), rowListItem);
        rView.setAdapter(rcAdapter);

        /*
        *
        * */

        return view;

    }

    @Override
    public void onStop() {
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }

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

    @Override
    public void onSliderClick(BaseSliderView slider) {
        try {
            ampliarImagen(lista.get(0));
        }catch (Exception ex) {}
    }

    public void ampliarImagen(int img) {
        Dialog builder = new Dialog(getContext());
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        builder.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                //nothing;
            }
        });

        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(img);
        builder.addContentView(imageView, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        builder.show();
    }

}
