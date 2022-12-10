package com.example.odevnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odevnavigation.databinding.FragmentAnasayfaBinding;
import com.example.odevnavigation.databinding.FragmentXBinding;
import com.google.android.material.snackbar.Snackbar;

public class XFragment extends Fragment {
private FragmentXBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentXBinding.inflate(inflater, container, false);
        binding.buttonY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.yEkraninaGecis);
        });
        return binding.getRoot();  }
}