package com.applovin.impl.sdk;

import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class d0 {
    public static /* bridge */ /* synthetic */ InstallSourceInfo a(PackageManager packageManager, String str) {
        return packageManager.getInstallSourceInfo(str);
    }
}
