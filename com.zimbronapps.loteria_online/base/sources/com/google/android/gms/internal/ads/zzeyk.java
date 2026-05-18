package com.google.android.gms.internal.ads;

import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeyk implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeyk(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzeyk zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeyk(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeyi zzb() {
        return new zzeyi(((zzcmj) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
