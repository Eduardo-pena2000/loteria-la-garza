package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcck implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcck(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcck zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcck(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzccj zzb() {
        return new zzccj((E6.f) this.zza.zzb(), (zzcch) this.zzb.zzb());
    }
}
