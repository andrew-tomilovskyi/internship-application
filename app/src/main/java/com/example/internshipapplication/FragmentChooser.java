package com.example.internshipapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class FragmentChooser extends Fragment {

    private AppCompatButton ladaButton;
    private AppCompatButton hondaButton;
    private AppCompatButton audiButton;
    private AppCompatButton porscheButton;
    private AppCompatButton teslaButton;

    public FragmentChooser() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_chooser, container, false);

        ladaButton = v.findViewById(R.id.btn_lada_sedan);
        hondaButton = v.findViewById(R.id.btn_honda_accord);
        audiButton = v.findViewById(R.id.btn_audi_a7);
        porscheButton = v.findViewById(R.id.btn_porsche_taycan);
        teslaButton = v.findViewById(R.id.btn_tesla_model_s);

        ladaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) Objects.requireNonNull(getActivity())).openLadaInfo();
            }
        });

        hondaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) Objects.requireNonNull(getActivity())).openHondaInfo();
            }
        });

        audiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) Objects.requireNonNull(getActivity())).openAudiInfo();
            }
        });

        porscheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) Objects.requireNonNull(getActivity())).openPorscheInfo();
            }
        });

        teslaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) Objects.requireNonNull(getActivity())).openTeslaInfo();
            }
        });

        return v;
    }

}