package com.example.multitimer;



import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    public FirstFragment(){
// Required empty public constructor
       /* TextView tv = (TextView) getView().findViewById(R.id.TextView11);
        tv.setText("test1");*/
    }

   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_first, container, false);

    }

}