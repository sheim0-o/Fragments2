package com.example.fragments2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
    }

    public void b1Click(View view) {
        manager.beginTransaction().replace(R.id.host, new FirstFragment())
                .addToBackStack(null).commit();
    }

    public void b2Click(View view) {
        manager
                .beginTransaction()
                .replace(R.id.host, GenericFragment.newInstance(0x5664d264, "Second fragment"))
                .addToBackStack(null).commit();
    }

    public void b3Click(View view) {
        manager
                .beginTransaction()
                .replace(R.id.host, GenericFragment.newInstance(0x64d26456, "Third fragment"))
                .addToBackStack(null).commit();
    }
}
