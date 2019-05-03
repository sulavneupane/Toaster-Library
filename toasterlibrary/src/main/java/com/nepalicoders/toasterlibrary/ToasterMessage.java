package com.nepalicoders.toasterlibrary;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;

import com.tree.rh.ctlib.CT;

public class ToasterMessage {

    private static ToasterMessage toasterMessage;

    private ToasterMessage() {
    }

    public static ToasterMessage getInstance() {
        if (toasterMessage == null) {
            toasterMessage = new ToasterMessage();
        }
        return toasterMessage;
    }

    public void show(Context c, String message) {
        new CT.Builder(c, message)
                .textCol(Color.BLACK)
                .backCol(Color.YELLOW)
                .borderCol(Color.BLACK)
                .borderWidth(20)
                .gravity(Gravity.CENTER)
                .radius(80, 0, 0, 80)
                .show();
    }

}
