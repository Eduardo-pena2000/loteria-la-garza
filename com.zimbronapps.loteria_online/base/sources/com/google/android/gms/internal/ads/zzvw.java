package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzvw {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzha zzc;

    public zzvw(zzafa zzafaVar, zzamd zzamdVar) {
    }

    public final void zza(zzha zzhaVar) {
        if (zzhaVar != this.zzc) {
            this.zzc = zzhaVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
