package com.example.multitimer;

public class TabThread extends Thread
{
    public FirstFragment fragment1 = null;

    public void run() {
        long i;
        for(i=0;i<1000;i++)
        {

            fragment1.setData(i);
        }
    }
}
