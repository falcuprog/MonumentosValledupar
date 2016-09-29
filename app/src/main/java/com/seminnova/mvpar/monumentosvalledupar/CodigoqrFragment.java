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

    public CodigoqrFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_codigoqr, container, false);

        escaner = new ZXingScannerView(view.getContext());

        escaner.setResultHandler(this);
        escaner.startCamera();
        return escaner;

    }

    @Override
    public void handleResult(Result rawResult) {
        String codigo;
        codigo = rawResult.getText();

        //Toast.makeText(this.getActivity(), codigo, Toast.LENGTH_SHORT).show();

        DescMonumento descMonumento;

        switch (codigo){

            case "monumentolavictoria":

                descMonumento = new DescMonumento(0,0,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentofortalezavaloryjusticia":

                descMonumento = new DescMonumento(0,1,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentolectordeltiempo":
                descMonumento = new DescMonumento(0,2,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentosierranevada":
                descMonumento = new DescMonumento(0,3,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentoelobelisco":
                descMonumento = new DescMonumento(0,4,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentorevolucionenmarcha":
                descMonumento = new DescMonumento(0, 5, getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            /*case "monumentolunavallenata":
                descMonumento = new DescMonumento(0,6,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentohernandodesantana":
                descMonumento = new DescMonumento(1,0,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentolapiloneramayor":
                descMonumento = new DescMonumento(1,1,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentocaciqueupar":
                descMonumento = new DescMonumento(1,2,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentoelviajero":
                descMonumento = new DescMonumento(1,3,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentoelparquedelasmadre":
                descMonumento = new DescMonumento(1,4,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;*/

            case "monumentopedazodeacordeon":
                descMonumento = new DescMonumento(1,0,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentoconjuntovallenato":
                descMonumento = new DescMonumento(1,1,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentolospoporos":
                descMonumento = new DescMonumento(1,2,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentomariamulata":
                descMonumento = new DescMonumento(1,3,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentolasirena":
                descMonumento = new DescMonumento(1,4,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentolaguacharaca":
                descMonumento = new DescMonumento(1,5,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentodosguitarras":
                descMonumento = new DescMonumento(1,6,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentopeleadegallos":
                descMonumento = new DescMonumento(1,7,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentocaracoldecolores":
                descMonumento = new DescMonumento(1,8,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentotambordedosparches":
                descMonumento = new DescMonumento(1,9,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentogaitas":
                descMonumento = new DescMonumento(1,10,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentomaracas":
                descMonumento = new DescMonumento(1,11,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentoacordeon":
                descMonumento = new DescMonumento(1,12,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentolasguitarras":
                descMonumento = new DescMonumento(1,13,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentocaja":
                descMonumento = new DescMonumento(1,14,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentopuyaymerengue":
                descMonumento = new DescMonumento(1,15,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentopaseoyson":
                descMonumento = new DescMonumento(1,16,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            /*case "monumentoskate":
                descMonumento = new DescMonumento(3,0,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentojuanajugan":
                descMonumento = new DescMonumento(4,0,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;

            case "monumentosantoeccehomo":
                descMonumento = new DescMonumento(4,1,getFragmentManager());
                descMonumento.mostrarDescripcion();
                break;*/

            default:
                Toast.makeText(this.getActivity(), "MONUMENTO NO IDENTIFICADO", Toast.LENGTH_SHORT).show();
                break;

        }

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
