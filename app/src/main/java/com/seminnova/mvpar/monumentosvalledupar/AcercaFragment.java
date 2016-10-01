package com.seminnova.mvpar.monumentosvalledupar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AcercaFragment extends Fragment {

    public AcercaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_acerca, container, false);
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

                    Fragment fragment = new InicioFragment();
                    FragmentManager fragMana = getFragmentManager();
                    fragMana.beginTransaction()
                            .remove(AcercaFragment.this)
                            .replace(R.id.content_frame2, fragment)
                            .commit();

                    return true;
                }
                return false;
            }
        });

    }

}
