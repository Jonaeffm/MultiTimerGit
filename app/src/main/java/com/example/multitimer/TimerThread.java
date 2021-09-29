package com.example.multitimer;

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

    }
}
