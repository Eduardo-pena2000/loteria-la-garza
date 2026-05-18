package com.google.android.gms.internal.drive;

import H6.h;
import com.google.android.gms.common.api.internal.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbq implements l.b {
    private final /* synthetic */ long zzfb;
    private final /* synthetic */ long zzfc;

    public zzbq(zzbp zzbpVar, long j, long j2) {
        this.zzfb = j;
        this.zzfc = j2;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((h.a) obj).onProgress(this.zzfb, this.zzfc);
    }

    public final void onNotifyListenerFailed() {
    }
}
