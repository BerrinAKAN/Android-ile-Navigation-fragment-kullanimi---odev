package com.example.odevnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odevnavigation.databinding.FragmentABinding;
import com.example.odevnavigation.databinding.FragmentAnasayfaBinding;
import com.google.android.material.snackbar.Snackbar;


public class AFragment extends Fragment {

private FragmentABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentABinding.inflate(inflater, container, false);
        binding.buttonB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.bEkraninaGecis);
        });
        return binding.getRoot();}
}