package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzod {
    public static final boolean zza(Object obj) {
        return !((zzoc) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzoc zzocVar = (zzoc) obj;
        zzoc zzocVar2 = (zzoc) obj2;
        if (!zzocVar2.isEmpty()) {
            if (!zzocVar.zze()) {
                zzocVar = zzocVar.zzb();
            }
            zzocVar.zzd(zzocVar2);
        }
        return zzocVar;
    }
}
