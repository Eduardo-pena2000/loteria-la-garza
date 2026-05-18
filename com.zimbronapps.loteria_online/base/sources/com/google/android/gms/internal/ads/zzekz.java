package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzekz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzekz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzekz zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzekz(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeky zzb() {
        return new zzeky((Context) this.zza.zzb(), (zzctl) this.zzb.zzb());
    }
}
