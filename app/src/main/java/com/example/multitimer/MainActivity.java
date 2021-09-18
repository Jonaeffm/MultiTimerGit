package com.example.multitimer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button;
    TabLayout tl;
    List<TabItem> til;

    public void onClickBtn(View v)
    {
        button.setText("geklickt");
        //TabItem ti = new TabItem();
        //ti.setN
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        tl=(TabLayout) findViewById(R.id.tabs);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                onClickBtn(v);
            }
        });
    }


}