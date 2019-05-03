package com.nepalicoders.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

import timber.log.Timber;

public class ToasterMessage {

    private static ToasterMessage toasterMessage;

    private ToasterMessage() {
        Timber.plant(new Timber.DebugTree());
    }

    public static ToasterMessage getInstance() {
        if (toasterMessage == null) {
            toasterMessage = new ToasterMessage();
        }
        return toasterMessage;
    }

    public void show(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        Timber.d(message);
    }

}
