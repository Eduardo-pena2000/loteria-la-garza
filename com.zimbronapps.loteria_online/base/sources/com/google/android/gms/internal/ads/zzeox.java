package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeox implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;

    public zzeox(zzeoz zzeozVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzeozVar);
    }

    public final void zza(boolean z, Context context, zzdbs zzdbsVar) throws zzdmb {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z);
            zzfkiVar.zzm();
        } catch (zzfjr e) {
            int i = o0.b;
            W5.p.g("Cannot show rewarded video.", e);
            throw new zzdmb(e.getCause());
        }
    }

    public final zzfir zzb() {
        return this.zzb;
    }
}
