package com.fragmentcommunicationpatternpoc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CommunicatorInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void putData(String args) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment_B frag = (Fragment_B) fm.findFragmentById(R.id.fragment2);
        frag.incrementData(args);

    }
}
