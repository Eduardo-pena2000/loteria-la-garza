package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzikb {
    final LinkedHashMap zza;

    public zzikb(int i) {
        this.zza = zzikd.zzc(i);
    }

    public final zzikb zza(Object obj, zzikp zzikpVar) {
        zziko.zza(obj, "key");
        zziko.zza(zzikpVar, "provider");
        this.zza.put(obj, zzikpVar);
        return this;
    }
}
