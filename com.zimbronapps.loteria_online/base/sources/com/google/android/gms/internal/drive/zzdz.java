package com.google.android.gms.internal.drive;

import H6.o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdz implements m {
    private final Status zzdy;
    private final o zzgr;

    public zzdz(Status status, o oVar) {
        this.zzdy = status;
        this.zzgr = oVar;
    }

    public final o getMetadata() {
        return this.zzgr;
    }

    public final Status getStatus() {
        return this.zzdy;
    }
}
