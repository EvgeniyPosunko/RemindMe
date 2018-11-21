package com.example.evgeniyposunko.remindme;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity { //AppCompatActivity-поддержка всего с дизайнЛайбрери

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault); //указал стиль темы дефолт
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
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
}
