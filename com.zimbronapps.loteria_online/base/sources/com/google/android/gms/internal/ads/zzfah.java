package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfah implements zzfax {
    private final zzccq zza;
    private final zzgzy zzb;
    private final Context zzc;

    public zzfah(zzccq zzccqVar, zzgzy zzgzyVar, Context context) {
        this.zza = zzccqVar;
        this.zzb = zzgzyVar;
        this.zzc = context;
    }

    public final x7.e zza() {
        return this.zzb.zzc(new zzfag(this));
    }

    public final int zzb() {
        return 34;
    }

    public final /* synthetic */ zzfai zzc() {
        zzccq zzccqVar = this.zza;
        Context context = this.zzc;
        if (!zzccqVar.zza(context)) {
            return new zzfai(null, null, null, null, null);
        }
        String zzh = zzccqVar.zzh(context);
        String str = zzh == null ? "" : zzh;
        String zzi = zzccqVar.zzi(context);
        String str2 = zzi == null ? "" : zzi;
        String zzj = zzccqVar.zzj(context);
        String str3 = zzj == null ? "" : zzj;
        String str4 = true != zzccqVar.zza(context) ? null : "fa";
        return new zzfai(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) S5.D.c().zzd(zzbhe.zzaR) : null);
    }
}
