package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbn implements zzikg {
    private final zzikp zza;

    private zzfbn(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzfbn zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfbn(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbm zzb() {
        return new zzfbm(zzfmk.zzc(), ((zzcmj) this.zza).zza());
    }
}
