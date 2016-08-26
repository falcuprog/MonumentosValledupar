package com.seminnova.mvpar.monumentosvalledupar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class BuscatFragment extends Fragment {

    private LinearLayoutManager lLayout;

    public BuscatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_buscat, container, false);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(view.getContext());

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Búsqueda Categorías");

        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(view.getContext(), rowListItem, getFragmentManager());//ojo
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

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Monumentos Abstractos y Simbólicos", R.drawable.slider1));
        allItems.add(new ItemObject("Monumentos Biográficos y Históricos", R.drawable.slider3));
        allItems.add(new ItemObject("Monumentos Culturales y Folclóricos", R.drawable.slider4));
        allItems.add(new ItemObject("Monumentos Deportivos", R.drawable.slider4));
        allItems.add(new ItemObject("Monumentos Religiosos", R.drawable.slider7));

        return allItems;
    }

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

                    /*Fragment fragment = new InicioFragment();
                    FragmentManager fragMana = getFragmentManager();
                    fragMana.beginTransaction()
                            .remove(BuscatFragment.this)
                            .replace(R.id.content_frame, fragment)
                            .commit();
                    */
      /*              return true;
                }
                return false;
            }
        });

    }*/

}
