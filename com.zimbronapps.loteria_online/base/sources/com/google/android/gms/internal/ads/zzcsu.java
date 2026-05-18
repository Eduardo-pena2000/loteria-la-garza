package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcsu implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcsu(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcsu zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzcsu(zzikpVar, zzikpVar2, zzikpVar3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdb zzbdbVar = (zzbdb) this.zza.zzb();
        return new zzcsn(zzbdbVar.zzd(), (zzbti) this.zzb.zzb(), zzfmi.zzc());
    }
}
