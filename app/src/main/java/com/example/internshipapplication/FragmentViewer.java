package com.example.internshipapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

public class FragmentViewer extends Fragment {

    private AppCompatImageView carPhoto;
    private AppCompatTextView carInfo;
    private CarModel carBlyat;

    public FragmentViewer() {
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
        View v = inflater.inflate(R.layout.fragment_viewer, container, false);

        carPhoto = v.findViewById(R.id.car_photo);
        carInfo = v.findViewById(R.id.car_info);
        return v;
    }


}