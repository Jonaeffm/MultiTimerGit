package com.example.multitimer;





import static android.os.SystemClock.setCurrentTimeMillis;
import static android.os.SystemClock.sleep;

import static java.lang.System.currentTimeMillis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;

import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity
{
    int zaehler;
    Button button;
    TabLayout tl;
    List<TabItem> til;
    List<Timer> tlist=null;
    EditText et ;
    EditText etm;
    FirstFragment fragment1 = null;
    SecondFragment fragment2 = null;
    FrameLayout simpleFrameLayout;
    TextView tv;
    FragmentManager fm;
    FragmentTransaction ft ;
    TabLayout.Tab firstTab;
    TabLayout.Tab secondTab;
    TabThread tt;

    public void onClickBtn(View v) {
        button.setText("geklickt");

        zaehler++;
        // Create a new Tab named "First"
        switch (zaehler)
        {
            case 1:
                firstTab = tl.newTab();
                firstTab.setText(et.getText()); // set the Text for the first Tab
                tl.addTab(firstTab); // add  the tab at in the TabLayout
                Timer t = new Timer();
                t.setEndTime(currentTimeMillis()+Long.parseLong(etm.getText().toString())*60000);
                tlist= Arrays.asList(t);

                break;
            case 2:
                secondTab = tl.newTab();
                secondTab.setText(et.getText()); // set the Text for the first Tab
                tl.addTab(secondTab); // add  the tab at in the TabLayout
                Timer t2 = new Timer();
                t2.setEndTime(currentTimeMillis()+Long.parseLong(etm.getText().toString())*60000);
               // tlist= Arrays.asList(tlist.get(0),t2);


                break;
        }

        /* TabLayout.Tab tab = tl.newTab();
        tab.setText(et.getText());
       // TextView tv = new TextView(this);
        //tv.setText("test");
        tab.setContentDescription("testContent");
        tl.addTab(tab);*/

        tl.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {



                // get the current selected tab's position and replace the fragment accordingly
                switch (tab.getPosition()) {
                    case 0:
                        fragment1 = new FirstFragment();
                        fm = getSupportFragmentManager();
                        ft = fm.beginTransaction();
                        ft.replace(R.id.simpleFrameLayout,fragment1);
                        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                        ft.commit();

                        tt = new TabThread();
                        tt.setFragment1(fragment1);
                        tt.setT(tlist.get(0));
                        tt.start();

                        /*View view = fragment1.getView();
                        //if (view!=null) {
                            //tv.setText("test1");
                            tv =(TextView) view.findViewById(R.id.TextView11);

                            tv.setText("test1");
                        //}*/
                        //Inflater inflater = new Inflater();
                        //View view = inflater.inflate(R.layout.fragment_first, RelativeLayout, false);
                       //tv =(TextView) view.findViewById(R.id.TextView11);
                        //tv.setText("test1");

                        break;
                    case 1:
                        //fragment2 = new SecondFragment();
try {
    tt.stop();
}catch(Exception e)
{
    
}
                        //fm = getSupportFragmentManager();
                        //ft = fm.beginTransaction();
                       /* ft.replace(R.id.simpleFrameLayout,fragment2);
                        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                        ft.commit();*/

                       // tv= (TextView) SecondFragment.getView().findViewById(R.id.TextView22);
                        //tv.setText("test2");
                        //TabThread tt2 = new TabThread();
                        //tt2.setFragment1(fragment2);
                        //tt2.setT(tlist.get(1));
                        //tt2.start();
                        break;


                    default:

                        throw new IllegalStateException("Unexpected value: " + tab.getPosition());
                }


                /*case 2:
                        fragment = new ThirdFragment();
                        break;*/







            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }




        });
    }

    // @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        zaehler = 0;
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        tl = (TabLayout) findViewById(R.id.tabs);
        et = (EditText) findViewById(R.id.et_simple);
    etm = (EditText) findViewById(R.id.editTextNumberDecimal);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                onClickBtn(v);
            }
        });
    }
}