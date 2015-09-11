package com.example.hp.photogallery;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by hp on 15.08.15.
 */
public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (getResultCode()!= Activity.RESULT_OK) return;
        int requestCode = intent.getIntExtra("REQUEST_CODE",0);
        Notification notification = (Notification)intent.getParcelableExtra("NOTIFICATION");
        NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(requestCode,notification);
    }
}
