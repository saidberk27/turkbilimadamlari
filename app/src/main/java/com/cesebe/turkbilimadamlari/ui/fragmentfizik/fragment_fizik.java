package com.cesebe.turkbilimadamlari.ui.fragmentfizik;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cesebe.turkbilimadamlari.R;

public class fragment_fizik extends Fragment {

    private FragmentFizikViewModel mViewModel;

    public static fragment_fizik newInstance() {
        return new fragment_fizik();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fizik, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FragmentFizikViewModel.class);
        // TODO: Use the ViewModel
    }

}
