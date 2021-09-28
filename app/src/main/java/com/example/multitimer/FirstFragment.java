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

    protected long data; // here your asynchronously loaded data

    public void setData(long data) {
        this.data = data;
        // The reload fragment code here !
        if (! this.isDetached()) {
            getFragmentManager().beginTransaction()
                    .detach(this)
                    .attach(this)
                    .commit();
        }
    }

   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
TextView tv = null;
                        View view =inflater.inflate(R.layout.fragment_first, container, false);
                        //if (view!=null) {
                            //tv.setText("test1");
                            tv =(TextView) view.findViewById(R.id.TextView11);

                            tv.setText(Long.toString(data));
        return view;

    }

}