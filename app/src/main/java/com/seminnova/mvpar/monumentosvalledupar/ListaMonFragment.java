package com.seminnova.mvpar.monumentosvalledupar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ListaMonFragment extends Fragment {

    private LinearLayoutManager lLayout;
    private String titulo;

    public ListaMonFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista_mon, container, false);

        List<MonumentoObject> rowListItem = RecyclerViewHoldersCat.listaMon;
        titulo = RecyclerViewHoldersCat.titulo;
        //((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);

        lLayout = new LinearLayoutManager(this.getActivity());

        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view_listamon);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapterListaMon rcAdapter = new RecyclerViewAdapterListaMon(view.getContext(), rowListItem, getFragmentManager());
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

                    Fragment fragment = new BuscatFragment();
                    FragmentManager fragMana = getFragmentManager();
                    fragMana.beginTransaction()
                            .remove(ListaMonFragment.this)
                            .replace(R.id.content_frame2, fragment)
                            .commit();

                    return true;
                }
                return false;
            }
        });

    }
}
