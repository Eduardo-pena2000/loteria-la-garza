package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbaf extends zzaxz {
    public Long zza;
    public Long zzb;

    public zzbaf() {
    }

    public final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }

    public zzbaf(String str) {
        HashMap zzb = zzaxz.zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Long) zzb.get(1);
        }
    }
}
