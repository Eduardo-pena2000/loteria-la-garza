package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzico {
    public static final List zza(Object obj, long j) {
        zzicd zzicdVar = (zzicd) zziem.zzn(obj, j);
        if (zzicdVar.zza()) {
            return zzicdVar;
        }
        int size = zzicdVar.size();
        zzicd zzh = zzicdVar.zzh(size == 0 ? 10 : size + size);
        zziem.zzo(obj, j, zzh);
        return zzh;
    }
}
