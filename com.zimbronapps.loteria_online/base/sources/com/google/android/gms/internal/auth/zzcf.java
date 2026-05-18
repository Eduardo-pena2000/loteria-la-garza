package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcf extends ContentObserver {
    final /* synthetic */ zzcg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(zzcg zzcgVar, Handler handler) {
        super((Handler) null);
        this.zza = zzcgVar;
    }

    public final void onChange(boolean z) {
        this.zza.zze();
    }
}
