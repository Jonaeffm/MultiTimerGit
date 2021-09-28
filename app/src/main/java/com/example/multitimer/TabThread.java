package com.example.multitimer;

import static java.lang.Thread.sleep;

public class TabThread extends Thread
{
    public FirstFragment fragment1 = null;

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
