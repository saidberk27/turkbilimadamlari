package com.cesebe.turkbilimadamlari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cesebe.turkbilimadamlari.ui.fragmentmatematik.fragment_matematik;

public class matematik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matematik_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment_matematik.newInstance())
                    .commitNow();
        }
    }
}
