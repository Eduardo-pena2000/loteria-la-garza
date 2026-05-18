package com.google.android.gms.internal.ads;

import android.content.pm.PackageManager;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class m {
    public static /* bridge */ /* synthetic */ void a(PackageManager packageManager, String str, boolean z, int i, List list, PackageManager.OnChecksumsReadyListener onChecksumsReadyListener) {
        packageManager.requestChecksums(str, z, i, list, onChecksumsReadyListener);
    }
}
