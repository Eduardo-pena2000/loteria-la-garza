package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzca extends ContentObserver {
    public zzca(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        zzcb.zzb().set(true);
    }
}
