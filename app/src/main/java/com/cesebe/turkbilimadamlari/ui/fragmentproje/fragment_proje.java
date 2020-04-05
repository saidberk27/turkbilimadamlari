package com.cesebe.turkbilimadamlari.ui.fragmentproje;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cesebe.turkbilimadamlari.R;

public class fragment_proje extends Fragment {

    private FragmentProjeViewModel mViewModel;

    public static fragment_proje newInstance() {
        return new fragment_proje();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_proje, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FragmentProjeViewModel.class);
        // TODO: Use the ViewModel
    }

}
