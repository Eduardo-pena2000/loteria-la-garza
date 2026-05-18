package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeoi implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeoi(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzeoi zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeoi(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeoh zzb() {
        return new zzeoh((Context) this.zza.zzb(), (zzdue) this.zzb.zzb());
    }
}
