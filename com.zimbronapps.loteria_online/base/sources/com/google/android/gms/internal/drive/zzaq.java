package com.google.android.gms.internal.drive;

import H6.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaq implements k, m {
    private final Status zzdy;
    private final p zzdz;
    private final boolean zzea;

    public zzaq(Status status, p pVar, boolean z) {
        this.zzdy = status;
        this.zzdz = pVar;
        this.zzea = z;
    }

    public final p getMetadataBuffer() {
        return this.zzdz;
    }

    public final Status getStatus() {
        return this.zzdy;
    }

    public final void release() {
        p pVar = this.zzdz;
        if (pVar != null) {
            pVar.release();
        }
    }
}
