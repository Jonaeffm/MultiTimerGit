package com.example.multitimer;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

import androidx.fragment.app.Fragment;

public class TabThread extends Thread
{
    private FragmentExtender fragment1 = null;
    private Timer t = null;

    public Timer getT() {
        return t;
    }

    public void setT(Timer t) {
        this.t = t;
    }

    public void setFragment1(FragmentExtender fragment1) {
        this.fragment1 = fragment1;
    }

    public FragmentExtender getFragment1() {
        return fragment1;
    }

    public void run() {
        long i;
        for(;;)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long rest = (t.getEndTime()/1000)-(currentTimeMillis()/1000);
            if(rest == 0)
                break;
            fragment1.setData(rest);
        }
    }
}
