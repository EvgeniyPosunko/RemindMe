package com.example.evgeniyposunko.remindme;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity { //AppCompatActivity-поддержка всего с дизайнЛайбрери

    private static final int LAYOUT = R.layout.activity_main;

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault); //указал стиль темы дефолт
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
    
        initToolbar();
        ititNavigationView();
    }


    private void initToolbar() {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setTitle(R.string.app_name); //В туллбар указываю имя из sring файла
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });
        toolbar.inflateMenu(R.menu.menu);
    }

    private void ititNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

}
