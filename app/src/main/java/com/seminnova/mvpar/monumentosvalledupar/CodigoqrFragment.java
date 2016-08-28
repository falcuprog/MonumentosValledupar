package com.seminnova.mvpar.monumentosvalledupar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class CodigoqrFragment extends Fragment implements ZXingScannerView.ResultHandler {

    private ZXingScannerView escaner;

    public CodigoqrFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_codigoqr, container, false);

        //((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Búsqueda QR");



        escaner = new ZXingScannerView(view.getContext());

        escaner.setResultHandler(this);
        escaner.startCamera();
        return escaner;

    }

    @Override
    public void handleResult(Result rawResult) {
        String codigo;
        codigo = rawResult.getText();
        Toast.makeText(this.getActivity(), codigo, Toast.LENGTH_SHORT).show();
        escaner.resumeCameraPreview(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        escaner.stopCamera();
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
                            .remove(CodigoqrFragment.this)
                            .replace(R.id.content_frame2, fragment)
                            .commit();

                    return true;
                }
                return false;
            }
        });

    }

}
