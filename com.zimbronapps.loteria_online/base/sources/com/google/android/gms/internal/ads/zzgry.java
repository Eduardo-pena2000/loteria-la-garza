package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgry {
    public static zzgru zza(zzgru zzgruVar) {
        return ((zzgruVar instanceof zzgrx) || (zzgruVar instanceof zzgrv)) ? zzgruVar : zzgruVar instanceof Serializable ? new zzgrv(zzgruVar) : new zzgrx(zzgruVar);
    }
}
