package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzemf implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;
    final /* synthetic */ zzemg zzc;

    public zzemf(zzemg zzemgVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzemgVar);
        this.zzc = zzemgVar;
    }

    public final void zza(boolean z, Context context, zzdbs zzdbsVar) throws zzdmb {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z);
            if (this.zzc.zzc().c < ((Integer) S5.D.c().zzd(zzbhe.zzbo)).intValue()) {
                zzfkiVar.zzd();
            } else {
                zzfkiVar.zze(context);
            }
        } catch (zzfjr e) {
            int i = o0.b;
            W5.p.e("Cannot show interstitial.");
            throw new zzdmb(e.getCause());
        }
    }

    public final zzfir zzb() {
        return this.zzb;
    }
}
