package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhjq {
    private HashMap zza = new HashMap();

    public final zzhjr zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhjr zzhjrVar = new zzhjr(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhjrVar;
    }
}
