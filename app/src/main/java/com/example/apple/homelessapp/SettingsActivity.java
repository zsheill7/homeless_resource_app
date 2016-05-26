package com.example.apple.homelessapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class SettingsActivity extends AppCompatActivity {


    boolean hasChildren = false;
    boolean under18 = false;
    boolean isMale = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        setContentView(R.layout.activity_settings);
        ed.putBoolean("hasChildren", false);
        ed.putBoolean("under18", false);
        ed.putBoolean("isMale", true);
        ed.apply();


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(SettingsActivity.this, SelectionActivity.class);
        startActivity(intent);
    }

    public void setGender(View view) {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButtonM:
                if (checked) {
                    isMale = true;
                }
                break;
            case R.id.radioButtonF:
                if (checked) {
                    isMale = false;
                }
                break;
        }
        ed.putBoolean("isMale", isMale);
        ed.apply();

    }

    public void setChildren(View view) {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButtonY:
                if (checked) {
                    hasChildren = true;
                }
                break;
            case R.id.radioButtonN:
                if (checked) {
                    hasChildren = false;
                }
                break;
        }
        ed.putBoolean("hasChildren", hasChildren);
        ed.apply();

    }

    public void setAge(View view) {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked) {
                    under18 = true;
                }
                break;
            case R.id.radioButton2:
                if (checked) {
                    under18 = false;
                }
                break;

        }
        ed.putBoolean("under18", under18);
        ed.apply();

    }

}
