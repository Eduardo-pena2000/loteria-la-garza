package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeda implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeda(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar3;
        this.zzb = zzikpVar4;
    }

    public static zzeda zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzeda(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzecz zzb() {
        return new zzecz(zzfmq.zzc(), zzfmk.zzc(), ((zzedn) this.zza).zza(), zzikf.zzc(this.zzb));
    }
}
