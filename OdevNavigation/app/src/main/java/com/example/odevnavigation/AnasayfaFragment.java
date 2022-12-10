package com.example.odevnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odevnavigation.databinding.FragmentAnasayfaBinding;
import com.google.android.material.snackbar.Snackbar;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        binding.buttonA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.aEkraninaGecis);
        });
        return binding.getRoot();
    }
}