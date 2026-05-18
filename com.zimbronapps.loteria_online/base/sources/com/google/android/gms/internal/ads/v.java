package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class v {
    public static /* bridge */ /* synthetic */ ComponentName a(ActivityManager.RunningTaskInfo runningTaskInfo) {
        return runningTaskInfo.topActivity;
    }
}
