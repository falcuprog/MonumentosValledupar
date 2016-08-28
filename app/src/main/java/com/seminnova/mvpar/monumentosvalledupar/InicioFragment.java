package com.seminnova.mvpar.monumentosvalledupar;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;
import java.util.HashMap;

public class InicioFragment extends Fragment implements BaseSliderView.OnSliderClickListener {

    private SliderLayout mDemoSlider;

    private Toolbar mToolbar;
    private ViewPager mPager;
    private YourPagerAdapter mAdapter;
    private TabLayout mTabLayout;

    public InicioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /*
        *
        * NUEVO
        * */

        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        Toolbar mToolbar = (Toolbar) view.findViewById(R.id.app_bar);

        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(mToolbar);

        mDemoSlider = (SliderLayout) view.findViewById(R.id.slider);
        HashMap<String, Integer> url_maps = new HashMap<String, Integer>();

        url_maps.put("La Fuente", R.drawable.slider1);
        url_maps.put("Acordeón Vallenato", R.drawable.slider2);
        url_maps.put("El Obelisco", R.drawable.slider3);
        url_maps.put("Concejo Municipal", R.drawable.slider4);
        url_maps.put("La Revolución en Marcha", R.drawable.slider5);

        for (String name : url_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(view.getContext());//
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    //.image(url_maps.get(name))
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        //mDemoSlider.addOnPageChangeListener(this);//ESTO ES VIEJO*/

        /**
         *
         *
         * TABS
         *
         */

        mTabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        //mAdapter = new YourPagerAdapter(getActivity().getSupportFragmentManager());
        mAdapter = new YourPagerAdapter(getActivity().getSupportFragmentManager());
        //getSupportFragmentManager());
        mPager = (ViewPager) view.findViewById(R.id.view_pager);
        mPager.setAdapter(mAdapter);
        //Notice how the Tab Layout links with the Pager Adapter
        mTabLayout.setTabsFromPagerAdapter(mAdapter);

        //Notice how The Tab Layout adn View Pager object are linked
        mTabLayout.setupWithViewPager(mPager);
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        return view;

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(getView().getContext(), slider.getDescription(), Toast.LENGTH_SHORT).show();
    }

    public static class MyFragment extends Fragment {
        public static final java.lang.String ARG_PAGE = "arg_page";

        public MyFragment() {

        }

        public static MyFragment newInstance(int pageNumber) {
            MyFragment myFragment = new MyFragment();
            Bundle arguments = new Bundle();
            arguments.putInt(ARG_PAGE, pageNumber + 1);
            myFragment.setArguments(arguments);

            return myFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            Bundle arguments = getArguments();
            int pageNumber = arguments.getInt(ARG_PAGE);
            RecyclerView recyclerView = new RecyclerView(getActivity());
            recyclerView.setAdapter(new YourRecyclerAdapter(getActivity()));
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            return recyclerView;
        }
    }

}


class YourPagerAdapter extends FragmentStatePagerAdapter {

    public YourPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    static int pos;
    @Override
    public Fragment getItem(int position) {
        InicioFragment.MyFragment myFragment = InicioFragment.MyFragment.newInstance(position);
        pos = position;
        return myFragment;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }
}

class YourRecyclerAdapter extends RecyclerView.Adapter<YourRecyclerAdapter.YourRecyclerViewHolder> {
    private ArrayList<String> list = new ArrayList<>();
    private LayoutInflater inflater;

    public YourRecyclerAdapter(Context context) {
        inflater = LayoutInflater.from(context);

    }

    @Override
    public YourRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View root = inflater.inflate(R.layout.fragment_noticia1, viewGroup, false);
        YourRecyclerViewHolder holder = new YourRecyclerViewHolder(root);
        return holder;
    }

    @Override
    public void onBindViewHolder(YourRecyclerViewHolder yourRecyclerViewHolder, int i) {

            /* ESTE ERAyourRecyclerViewHolder.webView.setWebViewClient(new Callback());
            WebSettings webSettings = yourRecyclerViewHolder.webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setJavaScriptEnabled(true);
            yourRecyclerViewHolder.webView.clearHistory();
            yourRecyclerViewHolder.webView.clearFormData();
            yourRecyclerViewHolder.webView.clearCache(true);
            yourRecyclerViewHolder.webView.loadUrl("http://elpilon.com.co/la-restauracion-del-coliseo-julio-monsalvo"); ESTE ERA*/

        final ProgressBar progress = (ProgressBar) yourRecyclerViewHolder.itemView.findViewById(R.id.pb);

        final RelativeLayout relativeLayout = (RelativeLayout) yourRecyclerViewHolder.itemView.findViewById(R.id.relative);

        progress.getIndeterminateDrawable().setColorFilter(
                Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);

        //WebView webView = (WebView) yourRecyclerViewHolder.itemView.findViewById(R.id.webview);
        yourRecyclerViewHolder.webView.loadUrl("http://www.milanadictos.net");
        yourRecyclerViewHolder.webView.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageFinished(WebView view, String url){
                relativeLayout.removeView(progress);
            }
        });

    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            return (false);
        }
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    static class YourRecyclerViewHolder extends RecyclerView.ViewHolder {

        WebView webView;

        public YourRecyclerViewHolder(View itemView) {
            super(itemView);
            webView = (WebView) itemView.findViewById(R.id.WebView01);
        }
    }
}




       /* if (YourPagerAdapter.pos == 0) {

            WebSettings webSettings = yourRecyclerViewHolder.webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            yourRecyclerViewHolder.webView.setWebViewClient(new Callback());
            webSettings.setJavaScriptEnabled(true);
            yourRecyclerViewHolder.webView.clearCache(true);
            yourRecyclerViewHolder.webView.loadUrl("http://www.milanadictos.net/");
        }else if (YourPagerAdapter.pos == 1) {
            yourRecyclerViewHolder.webView.setWebViewClient(new Callback());
            WebSettings webSettings = yourRecyclerViewHolder.webView.getSettings();
            webSettings.setBuiltInZoomControls(true);

            webSettings.setJavaScriptEnabled(true);
            yourRecyclerViewHolder.webView.clearCache(true);
            yourRecyclerViewHolder.webView.loadUrl("http://www.youtube.com/");
        } else if(YourPagerAdapter.pos == 2) {
            yourRecyclerViewHolder.webView.setWebViewClient(new Callback());
            WebSettings webSettings = yourRecyclerViewHolder.webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setJavaScriptEnabled(true);
            yourRecyclerViewHolder.webView.clearCache(true);
            yourRecyclerViewHolder.webView.loadUrl("http://www.elpilon.com.co/");
        }

    }*/
