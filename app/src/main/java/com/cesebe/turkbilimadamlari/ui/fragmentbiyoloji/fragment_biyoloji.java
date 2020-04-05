package com.cesebe.turkbilimadamlari.ui.fragmentbiyoloji;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cesebe.turkbilimadamlari.R;

public class fragment_biyoloji extends Fragment {

    private FragmentBiyolojiViewModel mViewModel;

    public static fragment_biyoloji newInstance() {
        return new fragment_biyoloji();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_biyoloji_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FragmentBiyolojiViewModel.class);
        // TODO: Use the ViewModel
    }

}
