package com.cesebe.turkbilimadamlari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cesebe.turkbilimadamlari.ui.fragmentbiyoloji.fragment_biyoloji;

public class fragment_biyoloji_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_biyoloji_activity_activitylayout);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment_biyoloji.newInstance())
                    .commitNow();
        }
    }
}
