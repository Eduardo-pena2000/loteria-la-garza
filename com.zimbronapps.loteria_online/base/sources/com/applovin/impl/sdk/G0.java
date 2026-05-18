package com.applovin.impl.sdk;

import android.app.ActivityManager;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class g0 {
    public static /* bridge */ /* synthetic */ List a(ActivityManager activityManager, int i) {
        return activityManager.getHistoricalProcessStartReasons(i);
    }
}
