package com.cesebe.turkbilimadamlari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cesebe.turkbilimadamlari.ui.fragmentcografya.fragment_cografya;

public class fragment_cografya_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_cografya_activitylayouts);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment_cografya.newInstance())
                    .commitNow();
        }
    }
}
