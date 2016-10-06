package com.seminnova.mvpar.monumentosvalledupar;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*toolbar = (Toolbar) findViewById(R.id.toolbar_ppal);
        //toolbar.setTitle("Monumentos Valledupar");
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        Fragment fragment = new InicioFragment();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commit();
        drawerLayout.closeDrawer(GravityCompat.START);
        */

        /*
        *
        * nuevo
        * */

        toolbar = (Toolbar) findViewById(R.id.toolbar_ppal);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        //drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        drawerLayout.closeDrawer(GravityCompat.START);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame2, new InicioFragment())
                .commit();


    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        Fragment fragmentById = getSupportFragmentManager().findFragmentById(R.id.content_frame2);

        if (id == R.id.inicio_id && !fragmentById.getClass().getName().equals("com.seminnova.mvpar.monumentosvalledupar.InicioFragment")) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame2, new InicioFragment())
                    .commit();

        } else if (id == R.id.busqr_id && !fragmentById.getClass().getName().equals("com.seminnova.mvpar.monumentosvalledupar.CodigoqrFragment")) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame2, new CodigoqrFragment())
                    .commit();

        } else if (id == R.id.busgps_id && !fragmentById.getClass().getName().equals("com.seminnova.mvpar.monumentosvalledupar.BusgpsFragment")) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame2, new BusgpsFragment())
                    .commit();

        } else if (id == R.id.buscat_id) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame2, new BuscatFragment())
                    .commit();

        } else if (id == R.id.contac_id) {
            /*getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame2, new ContaFragment())
                    .commit();*/
            this.finish();

        } else if (id == R.id.acerca_id) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame2, new AcercaFragment())
                    .commit();
        }

        //if(fragmentTransaction) {

          //  fragmentManager.beginTransaction()
            //        .replace(R.id.content_frame2, fragmento)
              //      .commit();
            //item.setChecked(true);

        //}

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {

            final Fragment fragmentById = getSupportFragmentManager().findFragmentById(R.id.content_frame2);
            if (fragmentById.getClass().getName().equals("com.seminnova.mvpar.monumentosvalledupar.BusgpsFragment")) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame2, new InicioFragment())
                        .commit();
            }
            else {
                super.onBackPressed();
            }
        }
    }

}
