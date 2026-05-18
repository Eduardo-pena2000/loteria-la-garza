package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzedn implements zzikg {
    private final zzikp zza;

    private zzedn(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzedn zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzedn(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeej zzb() {
        return new zzeej((Context) this.zza.zzb(), zzfmk.zzc());
    }
}
