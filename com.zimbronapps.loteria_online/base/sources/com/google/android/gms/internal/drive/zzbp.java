package com.google.android.gms.internal.drive;

import H6.h;
import com.google.android.gms.common.api.internal.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbp implements h.a {
    private final l zzfa;

    public zzbp(l lVar) {
        this.zzfa = lVar;
    }

    public final void onProgress(long j, long j2) {
        this.zzfa.c(new zzbq(this, j, j2));
    }
}
