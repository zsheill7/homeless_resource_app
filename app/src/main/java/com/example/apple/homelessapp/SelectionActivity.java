package com.example.apple.homelessapp;

import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View; //Widgets
import android.widget.Button;
import android.net.Uri;

public class SelectionActivity extends AppCompatActivity {


    public static final String EXTRA_INT = "type";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void sendMessage1(View view) {

        Intent intent = new Intent(SelectionActivity.this, BuildingActivity.class);
        intent.putExtra(EXTRA_INT, 1);
        startActivity(intent);
    }

    public void sendMessage2(View view) {

        Intent intent = new Intent(SelectionActivity.this, BuildingActivity.class);
        intent.putExtra(EXTRA_INT, 2);
        startActivity(intent);
    }

    public void sendMessage3(View view) {

        Intent intent = new Intent(SelectionActivity.this, BuildingActivity.class);
        intent.putExtra(EXTRA_INT, 3);
        startActivity(intent);
    }
    public void sendMessageSettings(MenuItem menuItem) {

        Intent intent = new Intent(SelectionActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    public void sendMessageSettings(View view) {

        Intent intent = new Intent(SelectionActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    public void sendMessageAboutUs(MenuItem menuItem) {

        Intent intent = new Intent(SelectionActivity.this, AboutUsActivity.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);


    }

    /*public void installGooglePlay(Fragment fragment) {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.example.apple.homelessapp")));

    }*/



}
