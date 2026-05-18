package com.google.android.gms.internal.firebase-auth-api;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzoj {
    private HashMap zza = new HashMap();

    public final zzok zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzok zzokVar = new zzok(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzokVar;
    }
}
