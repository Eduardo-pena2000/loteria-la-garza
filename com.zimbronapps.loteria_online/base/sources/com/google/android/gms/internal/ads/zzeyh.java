package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeyh implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzeyh(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
    }

    public static zzeyh zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzeyh(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeyf zzb() {
        return new zzeyf(zzfmk.zzc(), ((zzctv) this.zza).zza(), (Context) this.zzb.zzb(), ((zziks) this.zzc).zzc());
    }
}
