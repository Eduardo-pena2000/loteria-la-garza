package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbbi extends zzbby {
    private final zzbac zzh;

    public zzbbi(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, zzbac zzbacVar) {
        super(zzbakVar, "mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", zzawgVar, i, 94);
        this.zzh = zzbacVar;
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zze.invoke((Object) null, new Object[]{this.zzh.zzb()})).intValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzaj(zzawu.zza(intValue));
        }
    }
}
