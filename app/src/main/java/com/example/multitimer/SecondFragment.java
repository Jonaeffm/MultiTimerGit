package com.example.multitimer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SecondFragment extends FragmentExtender {

    public SecondFragment(){
// Required empty public constructor

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_second, container, false);
        TextView tv = null;
        tv =(TextView) view.findViewById(R.id.TextView11);

        tv.setText(Long.toString(data));
        return view ;
    }
}
