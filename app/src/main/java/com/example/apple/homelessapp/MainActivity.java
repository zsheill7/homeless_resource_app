package com.example.apple.homelessapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;       //Widgets
import android.widget.Button;   //Using buttons
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button nextButton;
    RadioGroup gender;
    RadioGroup children;
    RadioGroup age;
    boolean isMale;
    boolean hasChildren;
    boolean under18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //Opens new activity
    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, SelectionActivity.class);
        startActivity(intent);
    }

    public void setGender(View view) {
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

    }

    public void setChildren(View view) {
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

    }

    public void setAge(View view) {
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

    }

    public boolean getMale() {
        return isMale;
    }

    public boolean getHasChildren() {
        return hasChildren;
    }

    public boolean getUnder18() {
        return under18;
    }
}










