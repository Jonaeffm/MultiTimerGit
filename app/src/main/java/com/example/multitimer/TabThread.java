package com.example.multitimer;

import static java.lang.Thread.sleep;

public class TabThread extends Thread
{
    private FirstFragment fragment1 = null;

    public void setFragment1(FirstFragment fragment1) {
        this.fragment1 = fragment1;
    }

    public FirstFragment getFragment1() {
        return fragment1;
    }

    public void run() {
        long i;
        for(i=0;i<1000;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fragment1.setData(i);
        }
    }
}
