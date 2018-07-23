package com.rajeshapple.dial.dialpad;

import android.util.Log;

/**
 * Created by super on 7/23/18.
 */

public class DialPad {
    public void data(String Msg)
    {
        Log.d(DialPad.this.getClass().getSimpleName(),Msg);
        System.out.println(DialPad.this.getClass().getSimpleName()+"--"+Msg);
    }
}
