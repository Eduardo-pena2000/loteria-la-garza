package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzemk implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzemk(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzemk zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzemk(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemj zzb() {
        return new zzemj((Context) this.zza.zzb(), (zzdlu) this.zzb.zzb());
    }
}
