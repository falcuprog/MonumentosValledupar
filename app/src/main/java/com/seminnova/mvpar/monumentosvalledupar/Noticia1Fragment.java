package com.seminnova.mvpar.monumentosvalledupar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class Noticia1Fragment extends Fragment {

    private WebView webView;

    public Noticia1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_noticia1, container, false);

        /*webView = (WebView)view.findViewById(R.id.WebView01);
        webView.setWebViewClient(new Callback());
        
        WebSettings webSettings = webView.getSettings();
        //webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);

        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.loadUrl("http://elpilon.com.co/la-restauracion-del-coliseo-julio-monsalvo");
*/
        return view;

    }

    /*private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            return (false);
        }
    }*/

}
