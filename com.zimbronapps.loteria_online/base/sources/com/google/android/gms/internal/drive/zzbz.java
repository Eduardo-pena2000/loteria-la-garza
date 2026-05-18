package com.google.android.gms.internal.drive;

import H6.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbz implements m {
    private final Status zzdy;
    private final i zzfj;

    public zzbz(Status status, i iVar) {
        this.zzdy = status;
        this.zzfj = iVar;
    }

    public final i getDriveFolder() {
        return this.zzfj;
    }

    public final Status getStatus() {
        return this.zzdy;
    }
}
