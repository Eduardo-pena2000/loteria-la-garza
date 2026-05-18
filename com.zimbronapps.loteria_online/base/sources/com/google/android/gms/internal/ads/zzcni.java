package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcni implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcni(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcni zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzcni(zzikpVar, zzikpVar2, zzikpVar3);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbzn zzb() {
        Context zza = ((zzcmj) this.zza).zza();
        zzfor zzforVar = (zzfor) this.zzb.zzb();
        zzgzy zzc = zzfmk.zzc();
        zzbsz zza2 = R5.t.v().zza(zza, W5.a.M1(), zzforVar);
        zzbst zzbstVar = zzbsw.zza;
        zza2.zza("google.afma.request.getAdDictionary", zzbstVar, zzbstVar);
        return new zzbzq(zza, R5.t.v().zza(zza, W5.a.M1(), zzforVar).zza("google.afma.sdkConstants.getSdkConstants", zzbstVar, zzbstVar), W5.a.M1(), zzc);
    }
}
