package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzti implements zzth {
    private final Object zza;

    private zzti(Object obj) {
        this.zza = obj;
    }

    public static zzth zza(Object obj) {
        if (obj != null) {
            return new zzti(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final Object zzb() {
        return this.zza;
    }
}
