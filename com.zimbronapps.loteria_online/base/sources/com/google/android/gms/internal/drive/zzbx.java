package com.google.android.gms.internal.drive;

import H6.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbx implements m {
    private final Status zzdy;
    private final h zzfi;

    public zzbx(Status status, h hVar) {
        this.zzdy = status;
        this.zzfi = hVar;
    }

    public final h getDriveFile() {
        return this.zzfi;
    }

    public final Status getStatus() {
        return this.zzdy;
    }
}
