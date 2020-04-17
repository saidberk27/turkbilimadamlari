package com.cesebe.turkbilimadamlari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cesebe.turkbilimadamlari.ui.tipfragment.tip_fragment;

public class fragment_tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tip_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, tip_fragment.newInstance())
                    .commitNow();
        }
    }
}
