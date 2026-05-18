package com.google.android.gms.internal.drive;

import H6.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzal implements k, m {
    private final Status zzdy;
    private final g zzo;

    public zzal(Status status, g gVar) {
        this.zzdy = status;
        this.zzo = gVar;
    }

    public final g getDriveContents() {
        return this.zzo;
    }

    public final Status getStatus() {
        return this.zzdy;
    }

    public final void release() {
        g gVar = this.zzo;
        if (gVar != null) {
            gVar.zzj();
        }
    }
}
