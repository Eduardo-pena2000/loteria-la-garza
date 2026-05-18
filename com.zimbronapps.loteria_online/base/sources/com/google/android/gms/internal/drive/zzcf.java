package com.google.android.gms.internal.drive;

import H6.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcf implements m {
    private final Status zzdy;
    private final n zzfm;

    private zzcf(zzcb zzcbVar, Status status, n nVar) {
        this.zzdy = status;
        this.zzfm = nVar;
    }

    public final n getFileUploadPreferences() {
        return this.zzfm;
    }

    public final Status getStatus() {
        return this.zzdy;
    }

    public /* synthetic */ zzcf(zzcb zzcbVar, Status status, n nVar, zzcc zzccVar) {
        this(zzcbVar, status, nVar);
    }
}
