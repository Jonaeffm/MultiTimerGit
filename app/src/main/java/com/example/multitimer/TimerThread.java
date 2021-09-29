package com.example.multitimer;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

import java.util.List;

public class TimerThread extends Thread
{
    private long now ;
    private List<Timer> tlist;

    public List<Timer> getTlist() {
        return tlist;
    }

    public void setTlist(List<Timer> tlist) {
        this.tlist = tlist;
    }

    @Override
    public void run() {
        now = currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0;i<2;i++){
            if (tlist.get(i).getEndTime()==now)
            {
                
            }
        }
        run();
    }
}
