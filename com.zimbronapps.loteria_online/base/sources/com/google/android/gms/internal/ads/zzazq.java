package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzazq extends zzaxz {
    public long zza;
    public long zzb;

    public zzazq() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzazq(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zzb = zzaxz.zzb(str);
        if (zzb != null) {
            this.zza = ((Long) zzb.get(0)).longValue();
            this.zzb = ((Long) zzb.get(1)).longValue();
        }
    }
}
