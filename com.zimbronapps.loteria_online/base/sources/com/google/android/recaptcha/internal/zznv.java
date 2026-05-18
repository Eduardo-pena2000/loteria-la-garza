package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznv {
    public static final List zza(Object obj, long j) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j, zzd);
        return zzd;
    }
}
