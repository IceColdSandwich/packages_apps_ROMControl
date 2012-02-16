
package com.roman.romcontrol.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SystemRootTools extends BroadcastReceiver {

    private static final String TAG = "SystemRootTools";
    public static final String ACTION_RESTART_SYSTEMUI = "com.aokp.romcontrol.ACTION_RESTART_SYSTEMUI";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (ACTION_RESTART_SYSTEMUI.equals(action)) {
            new CMDProcessor().su.runWaitFor("pkill -TERM -f  com.android.systemui");
        }
    }

}