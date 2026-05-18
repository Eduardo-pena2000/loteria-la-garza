package com.google.android.gms.internal.drive;

import android.support.v4.media.session.b;
import com.google.android.gms.common.api.internal.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdo implements l.b {
    private final /* synthetic */ zzdg zzgp;

    public zzdo(zzdk zzdkVar, zzdg zzdgVar) {
        this.zzgp = zzdgVar;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        b.a(obj);
        this.zzgp.accept(null);
    }

    public final void onNotifyListenerFailed() {
    }
}
