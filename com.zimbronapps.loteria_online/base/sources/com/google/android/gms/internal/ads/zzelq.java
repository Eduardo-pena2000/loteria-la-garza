package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzelq implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzelq(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzelq zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzelq(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzelp zzb() {
        return new zzelp((Context) this.zza.zzb(), (zzcvc) this.zzb.zzb());
    }
}
