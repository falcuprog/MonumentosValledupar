package com.seminnova.mvpar.monumentosvalledupar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class MonAbsFragment extends Fragment {

    private LinearLayoutManager lLayout;
    private String titulo;

    public MonAbsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mon_abs, container, false);

        List<ItemObjectMonAbs> rowListItem = RecyclerViewHolders.listaMon;
        titulo = RecyclerViewHolders.titulo;
        //((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);

        lLayout = new LinearLayoutManager(this.getActivity());

        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view_monabs);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapterMonAbs rcAdapter = new RecyclerViewAdapterMonAbs(view.getContext(), rowListItem, getFragmentManager());
        rView.setAdapter(rcAdapter);

        return view;

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

/*    private List<ItemObjectMonAbs> getAllItemList(){

        List<ItemObjectMonAbs> allItems = new ArrayList<ItemObjectMonAbs>();
        allItems.add(new ItemObjectMonAbs("Peter James", "Vildansvagen 19, Lund Sweden", R.drawable.slider1_copia));
        allItems.add(new ItemObjectMonAbs("Henry Jacobs", "3 Villa Crescent London, UK", R.drawable.slider2_copia));
        allItems.add(new ItemObjectMonAbs("Bola Olumide", "Victoria Island Lagos, Nigeria", R.drawable.slider3_copia));
        allItems.add(new ItemObjectMonAbs("Chidi Johnson", "New Heaven Enugu, Nigeria", R.drawable.slider4_copia));
        allItems.add(new ItemObjectMonAbs("DeGordio Puritio", "Italion Gata, Padova, Italy", R.drawable.slider5_copia));
        allItems.add(new ItemObjectMonAbs("Gary Cook", "San Fransisco, United States", R.drawable.slider6_copia));
        allItems.add(new ItemObjectMonAbs("Edith Helen", "Queens Crescent, New Zealand", R.drawable.slider7_copia));
        allItems.add(new ItemObjectMonAbs("Kingston Dude", "Ivory Lane, Abuja, Nigeria", R.drawable.slider1_copia));
        allItems.add(new ItemObjectMonAbs("Edwin Bent", "Johnson Road, Port Harcourt, Nigeria", R.drawable.slider2_copia));
        allItems.add(new ItemObjectMonAbs("Grace Praise", "Federal Quarters, Abuja Nigeria", R.drawable.slider3_copia));

        return allItems;
    }*/

    /*@Override
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

                    Fragment fragment = new BuscatFragment();
                    FragmentManager fragMana = getFragmentManager();
                    fragMana.beginTransaction()
                            .remove(MonAbsFragment.this)
                            .replace(R.id.content_frame, fragment)
                            .commit();

                    return true;
                }
                return false;
            }
        });

    }*/

}
