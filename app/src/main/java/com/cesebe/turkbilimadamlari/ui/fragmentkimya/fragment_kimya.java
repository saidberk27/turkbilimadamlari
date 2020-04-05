package com.cesebe.turkbilimadamlari.ui.fragmentkimya;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cesebe.turkbilimadamlari.R;

public class fragment_kimya extends Fragment {

    private FragmentKimyaViewModel mViewModel;

    public static fragment_kimya newInstance() {
        return new fragment_kimya();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_kimya_layouts, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FragmentKimyaViewModel.class);
        // TODO: Use the ViewModel
    }

}
