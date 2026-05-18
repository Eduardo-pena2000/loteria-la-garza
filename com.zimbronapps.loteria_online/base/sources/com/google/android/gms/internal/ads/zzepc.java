package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzepc implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzepc(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzepc zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzepc(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzepb zzb() {
        return new zzepb((zzeqf) this.zza.zzb(), (zzdvp) this.zzb.zzb());
    }
}
