package com.amazon.device.simplesignin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.device.simplesignin.a.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class BroadcastHandler extends BroadcastReceiver {
    private static final String TAG = "BroadcastHandler";

    public void onReceive(Context context, Intent intent) {
        try {
            c.a().a(context, intent);
        } catch (Exception e) {
            Log.e(TAG, "Error in BroadcastReceiver onReceive: " + e);
        }
    }
}
