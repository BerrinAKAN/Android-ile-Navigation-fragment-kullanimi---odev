package com.example.odevnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odevnavigation.databinding.FragmentAnasayfaBinding;
import com.example.odevnavigation.databinding.FragmentYBinding;
import com.google.android.material.snackbar.Snackbar;


public class YFragment extends Fragment {
private FragmentYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentYBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}