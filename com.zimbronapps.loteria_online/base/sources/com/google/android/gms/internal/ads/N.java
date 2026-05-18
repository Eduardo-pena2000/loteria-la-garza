package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class n {
    public static /* bridge */ /* synthetic */ void a(AppOpsManager appOpsManager, String[] strArr, Executor executor, AppOpsManager.OnOpActiveChangedListener onOpActiveChangedListener) {
        appOpsManager.startWatchingActive(strArr, executor, onOpActiveChangedListener);
    }
}
