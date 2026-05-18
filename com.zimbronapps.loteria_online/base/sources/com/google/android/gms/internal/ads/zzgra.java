package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgra implements Serializable {
    public static zzgra zzc() {
        return zzgqj.zza;
    }

    public static zzgra zzd(Object obj) {
        return obj == null ? zzgqj.zza : new zzgrh(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgra zzb(zzgqt zzgqtVar);
}
