package com.example.multitimer;

import androidx.fragment.app.Fragment;

public class FragmentExtender extends Fragment {

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
}
