package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbta implements zzcer {
    final /* synthetic */ zzbsf zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcen zzc;
    final /* synthetic */ zzbtd zzd;

    public zzbta(zzbtd zzbtdVar, zzbsf zzbsfVar, Object obj, zzcen zzcenVar) {
        this.zza = zzbsfVar;
        this.zzb = obj;
        this.zzc = zzcenVar;
        Objects.requireNonNull(zzbtdVar);
        this.zzd = zzbtdVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        o0.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcen zzcenVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbsm) obj, obj2, zzcenVar);
    }
}
