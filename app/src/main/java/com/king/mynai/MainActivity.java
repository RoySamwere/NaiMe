package com.king.mynai;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView iv_wheel;
    TextView textView;
    Button button,popupButton;
    TextView tv;
    WebView pageYetu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

        tv =findViewById(R.id.nav_raffle);

        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songa = new Intent(MainActivity.this,PicOneActivity.class);
                startActivity(songa);
            }
        });


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


//        pageYetu = findViewById(R.id.webYetu);
//        WebSettings settingsb = pageYetu.getSettings();
//        settingsb.setJavaScriptEnabled(true);
//
//        pageYetu.loadUrl("file:///android_asset/index.html");
//       // pageYetu.loadUrl("http://www.google.com");
//


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_raffle) {

            Intent songa = new Intent(MainActivity.this,PicOneActivity.class);
            startActivity(songa);


        } else if (id == R.id.nav_gallery) {
            Intent songa = new Intent(MainActivity.this,Spiner1Activity.class);
            startActivity(songa);

        } else if (id == R.id.nav_slideshow) {
            Intent songa = new Intent(MainActivity.this,PopUp1Activity.class);
            startActivity(songa);

        } else if (id == R.id.nav_tools) {
            Intent songa = new Intent(MainActivity.this,PopUp2Activity.class);
            startActivity(songa);

        } else if (id == R.id.nav_share) {
            Intent songa = new Intent(MainActivity.this,Spiner4Activity.class);
            startActivity(songa);

        } else if (id == R.id.nav_send) {
            Intent songa = new Intent(MainActivity.this,LottoActivity.class);
            startActivity(songa);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
