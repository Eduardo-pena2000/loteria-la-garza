package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzduf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzduf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzduf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzduf(zzikpVar, zzikpVar2, zzikpVar3);
    }

    public final /* synthetic */ Object zzb() {
        int i = ((zzdaw) this.zzc).zza().zzp.zza;
        if (i != 0) {
            return i + (-1) != 0 ? ((zzepj) this.zzb).zza() : ((zzepj) this.zza).zza();
        }
        throw null;
    }
}
