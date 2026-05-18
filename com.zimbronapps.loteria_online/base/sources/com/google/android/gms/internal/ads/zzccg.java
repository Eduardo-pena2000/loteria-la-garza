package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzccg implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzccg(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzccg zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzccg(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzccf((Context) this.zza.zzb(), (q0) this.zzb.zzb());
    }
}
