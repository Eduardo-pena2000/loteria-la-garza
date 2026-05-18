package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfob implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzfob(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzfob zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfob(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfoa(((zzcmj) this.zza).zza(), (zzfoo) this.zzb.zzb());
    }
}
